/**
 * Return true if the user is authenticated
 * @returns boolean
 */
export function isAuthenticated() : boolean {
    // TODO: Need to check if token is valid and if user is authenticated
    return !!sessionStorage.getItem('token');
}


/**
 * Remove the token from the session storage
 */
export function logout() {
    sessionStorage.removeItem('token');
}