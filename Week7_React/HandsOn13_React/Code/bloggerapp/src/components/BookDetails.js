import React from 'react';

function BookDetails({ books }) {
    return (
        <div className="details-card">
            <h2>Book Details</h2>
            {books.map(book => (
                <div key={book.id}>
                    <h4>{book.bname}</h4>
                    <p>Price: {book.price}</p>
                </div>
            ))}
        </div>
    );
}

export default BookDetails;
