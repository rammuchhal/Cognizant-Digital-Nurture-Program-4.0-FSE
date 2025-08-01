import React from 'react';

function OfficeSpaceDisplay() {
    // Create a list of office space objects
    const officeSpaces = [
        {
            name: 'DBS',
            rent: 50000,
            address: 'Chennai',
            imgSrc: 'https://placehold.co/600x400/EEE/31343C?text=Office+Space+1'
        },
        {
            name: 'WeWork',
            rent: 75000,
            address: 'Mumbai',
            imgSrc: 'https://placehold.co/600x400/EEE/31343C?text=Office+Space+2'
        },
        {
            name: 'Regus',
            rent: 58000,
            address: 'Bangalore',
            imgSrc: 'https://placehold.co/600x400/EEE/31343C?text=Office+Space+3'
        }
    ];

    return (
        <div>
            {/* Create an element to display the heading */}
            <h1>Office Space, at Affordable Range</h1>

            {/* Loop through the office space items to display the data */}
            {officeSpaces.map((office, index) => {
                // Apply CSS: Display the color of the Rent in Red or Green
                const rentStyle = {
                    color: office.rent < 60000 ? 'red' : 'green'
                };

                return (
                    <div key={index} className="office-card">
                        {/* Attribute to display the image */}
                        <img src={office.imgSrc} alt={`${office.name} office space`} />

                        {/* Display the details from the office object */}
                        <h3>Name: {office.name}</h3>
                        <h3 style={rentStyle}>Rent: Rs. {office.rent}</h3>
                        <h3>Address: {office.address}</h3>
                    </div>
                );
            })}
        </div>
    );
}

export default OfficeSpaceDisplay;
