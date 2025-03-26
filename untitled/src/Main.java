public class Main {


    public class JwtSecretGenerator {
        public static void main(String[] args) {
            Key key = Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS256); // Generate secret key
            String encodedKey = Base64.getEncoder().encodeToString(key.getEncoded());
            System.out.println("Generated JWT Secret Key: " + encodedKey);
        }
    }

}