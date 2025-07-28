import React, { Component } from 'react';

class Posts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: []
        };
    }

    loadPosts = async () => {
        try {
            const response = await fetch('https://jsonplaceholder.typicode.com/posts');
            if (!response.ok) {
                throw new Error('Something went wrong!');
            }
            const postsData = await response.json();
            this.setState({ posts: postsData });
        } catch (error) {
            // For network or fetch-related errors
            alert(`Error fetching posts: ${error.message}`);
        }
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        alert(`Error in component: ${error.toString()}`);
        console.error("Component Error:", error, info);
    }

    render() {
        return (
            <div>
                <h1>Blog Posts</h1>
                {this.state.posts.map(post => (
                    <article key={post.id}>
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                    </article>
                ))}
            </div>
        );
    }
}

export default Posts;