// // Products fetch karna backend se
// async function loadProducts() {
//     const res = await fetch('/api/products');
//     const products = await res.json();
//
//     const container = document.getElementById('products-container');
//     container.innerHTML = '';
//
//     products.forEach(p => {
//         const div = document.createElement('div');
//         div.className = 'product-card';
//         div.innerHTML = `
//             <h3>${p.name}</h3>
//             <p>${p.description}</p>
//             <p>Price: $${p.price}</p>
//             <button onclick="addToCart(${p.id})">Add to Cart</button>
//         `;
//         container.appendChild(div);
//     });
// }
//
// // Add to Cart function
// async function addToCart(productId) {
//     const userId = 1; // Temporary user id, login ke baad dynamic hoga
//     const res = await fetch('/api/cart', {
//         method: 'POST',
//         headers: {'Content-Type': 'application/json'},
//         body: JSON.stringify({productId: productId, userId: userId, quantity: 1})
//     });
//     if (res.ok) alert('Product added to cart!');
//     else alert('Error adding product!');
// }
//
// // Page load
// document.addEventListener('DOMContentLoaded', loadProducts);