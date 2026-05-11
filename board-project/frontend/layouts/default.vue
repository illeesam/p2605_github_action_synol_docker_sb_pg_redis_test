<template>
  <div>
    <nav>
      <ul>
        <li><NuxtLink to="/board/notice">공지사항</NuxtLink></li>
        <li><NuxtLink to="/board/free">자유게시판</NuxtLink></li>
        <li><NuxtLink to="/board/qna">Q&A</NuxtLink></li>
      </ul>
    </nav>
    <main>
      <slot />
    </main>
    <style scoped>
      nav ul { display: flex; list-style: none; gap: 20px; background: #eee; padding: 10px; }
      nav a { text-decoration: none; color: #333; font-weight: bold; }
      nav a.router-link-active { color: #007bff; }
      main { padding: 20px; }
    </style>
  </div>
</template>
