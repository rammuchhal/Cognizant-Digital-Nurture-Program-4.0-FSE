import React from 'react';
import BloggerPage from './components/BloggerPage';
import ConditionalExamples from './components/ConditionalExamples';
import './App.css';

function App() {
  return (
    <div className="App">
      {/* This component shows the final 3-column layout */}
      <BloggerPage />

      {/* This component provides interactive examples of conditional rendering */}
      <ConditionalExamples />
    </div>
  );
}

export default App;
