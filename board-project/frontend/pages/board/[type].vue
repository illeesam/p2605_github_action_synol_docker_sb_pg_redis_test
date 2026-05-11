<template>
  <div>
    <h1>{{ boardTitle }}</h1>
    <div v-if="pending">Loading...</div>
    <div v-else>
      <ul>
        <li v-for="post in data.posts" :key="post.id">
          <h3>{{ post.title }}</h3>
          <p>{{ post.content }}</p>
        </li>
      </ul>
    </div>
  </div>
</template>

<script setup>
const route = useRoute()
const boardType = route.params.type
const boardTitle = computed(() => {
  const titles = { notice: '공지사항', free: '자유게시판', qna: 'Q&A' }
  return titles[boardType] || '알 수 없는 게시판'
})

const { data, pending } = await useFetch(`http://localhost:8080/api/boards/${boardType}`)
</script>
