<template>
  <div>
    <h1>{{ boardName }}</h1>
    <div v-if="pending">로딩 중...</div>
    <div v-else>
      <ul>
        <li v-for="post in data.posts" :key="post.id">
          {{ post.title }}
        </li>
      </ul>
    </div>
  </div>
</template>

<script setup>
const route = useRoute()
const config = useRuntimeConfig()
const boardId = route.params.id

const boardNames = {
  notice: '공지사항',
  free: '자유게시판',
  qna: 'Q&A'
}
const boardName = boardNames[boardId] || '알 수 없는 게시판'

const { data, pending } = await useFetch(`${config.public.apiBase}/boards/${boardId}`)
</script>
