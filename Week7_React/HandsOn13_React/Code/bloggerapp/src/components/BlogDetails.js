import React from 'react';

// This component receives an array of blogs and displays them.
function BlogDetails({ blogs }) {
    return (
        <div className="details-card">
            <h2>Blog Details</h2>
            {blogs.map((blog, index) => (
                <div key={index}>
                    <h4>{blog.title}</h4>
                    <p>{blog.content}</p>
                </div>
            ))}
        </div>
    );
}

export default BlogDetails;
