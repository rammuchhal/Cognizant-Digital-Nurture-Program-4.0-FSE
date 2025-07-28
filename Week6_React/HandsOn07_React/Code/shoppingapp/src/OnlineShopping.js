import React from 'react';

// This component holds the cart data and displays it.
class OnlineShopping extends React.Component {
    render() {
        // 2. An array of cart items is created here.
        const cartInfo = [
            { itemname: 'Laptop', price: 80000 },
            { itemname: 'TV', price: 120000 },
            { itemname: 'Washing Machine', price: 50000 },
            { itemname: 'Mobile', price: 30000 },
            { itemname: 'Fridge', price: 70000 },
        ];

        return (
            <div className="container">
                <h1>Items Ordered</h1>
                <table>
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Price</th>
                        </tr>
                    </thead>
                    <tbody>
                        {/* 3. Loop through the items and display the data in a table. */}
                        {cartInfo.map((item, index) => (
                            <tr key={index}>
                                <td>{item.itemname}</td>
                                <td>{item.price}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        );
    }
}

export default OnlineShopping;
