package data;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Data {
    public static void main(String[]args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("cookie", "JSESS_members-membersite-bosdkr03-2=DEE65156C93C95EB5C4EAFADB188EE65; JSESS_members-membersite-bosdkr04-1=BC5A2FE5A8E4D99F32FD1EA0AA932647; JSESS_members-membersite-bosdkr04-2=E766E401F26D192319B1725372C3EEB5; JSESS_members-membersite-tc03-1=F347DE23BFB0829454C0092CDCA0F76F; _fw_crm_v=34dfde45-138b-4af0-b663-a6fdac4e9743; WSENV=som; irsso_membersv2=DDA9D76EE04705C4FB4E8548742804363EF932C07FD4000B8086801D0ADB43E74654DAA3843C9AC75D940CEF3AAAF19DC95034BBE91AC77EE0A6E16DCDF7CDF65A04A4C14396311F476A2D969066C3ABB33743BB05DE78E2E4D4F2480ADF93ECAA6371362A9C23D350AE38EF6FCF91BB2E35A71558628AE4682DB5DD43364070; XSESSIONID=ATC03a|Ys7bb|Ys7Z3; AWSALB=JzW22XS47Le8+j9jWtvmeI0G2retdOgqg6EdeKM4g4/J/NDS3ZSStRNEKWhFP/7igfjiFZjdFinGJR6GhFcYZNTD9fC7Rs5i3Xv2UvID0EbOYcMCXsOzDG3lZZxd; AWSALBCORS=JzW22XS47Le8+j9jWtvmeI0G2retdOgqg6EdeKM4g4/J/NDS3ZSStRNEKWhFP/7igfjiFZjdFinGJR6GhFcYZNTD9fC7Rs5i3Xv2UvID0EbOYcMCXsOzDG3lZZxd")
                .uri(URI.create("https://members.iracing.com/memberstats/member/SearchSeriesResults?custid=628548&seasonyear=2022&seasonquarter=3"))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(response.body());
    }
}