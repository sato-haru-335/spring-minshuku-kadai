const stripe = Stripe('pk_test_51Ql9MXJlCuoB3whYCKZqrIyMgpzgfkVPVIMR7Nl1HKiUhZdhrSiwUFdt3eaCdp7bLZuVppy8erVcMZTcrixBHl5n00ybw20GMp');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click',() => {
    stripe.redirectToCheckout({
        sessionId:sessionId
    })
});