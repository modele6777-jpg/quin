package defpackage;

import com.adjust.sdk.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ir6 {
    public static final oi6[] a;
    public static final Map b;

    static {
        oi6 oi6Var = new oi6(oi6.i, "");
        a71 a71Var = oi6.f;
        oi6 oi6Var2 = new oi6(a71Var, "GET");
        oi6 oi6Var3 = new oi6(a71Var, "POST");
        a71 a71Var2 = oi6.g;
        oi6 oi6Var4 = new oi6(a71Var2, "/");
        oi6 oi6Var5 = new oi6(a71Var2, "/index.html");
        a71 a71Var3 = oi6.h;
        oi6 oi6Var6 = new oi6(a71Var3, "http");
        oi6 oi6Var7 = new oi6(a71Var3, Constants.SCHEME);
        a71 a71Var4 = oi6.e;
        oi6[] oi6VarArr = {oi6Var, oi6Var2, oi6Var3, oi6Var4, oi6Var5, oi6Var6, oi6Var7, new oi6(a71Var4, "200"), new oi6(a71Var4, "204"), new oi6(a71Var4, "206"), new oi6(a71Var4, "304"), new oi6(a71Var4, "400"), new oi6(a71Var4, "404"), new oi6(a71Var4, "500"), new oi6("accept-charset", ""), new oi6("accept-encoding", "gzip, deflate"), new oi6("accept-language", ""), new oi6("accept-ranges", ""), new oi6("accept", ""), new oi6("access-control-allow-origin", ""), new oi6("age", ""), new oi6("allow", ""), new oi6("authorization", ""), new oi6("cache-control", ""), new oi6("content-disposition", ""), new oi6("content-encoding", ""), new oi6("content-language", ""), new oi6("content-length", ""), new oi6("content-location", ""), new oi6("content-range", ""), new oi6("content-type", ""), new oi6("cookie", ""), new oi6("date", ""), new oi6("etag", ""), new oi6("expect", ""), new oi6("expires", ""), new oi6("from", ""), new oi6("host", ""), new oi6("if-match", ""), new oi6("if-modified-since", ""), new oi6("if-none-match", ""), new oi6("if-range", ""), new oi6("if-unmodified-since", ""), new oi6("last-modified", ""), new oi6("link", ""), new oi6("location", ""), new oi6("max-forwards", ""), new oi6("proxy-authenticate", ""), new oi6("proxy-authorization", ""), new oi6("range", ""), new oi6("referer", ""), new oi6("refresh", ""), new oi6("retry-after", ""), new oi6("server", ""), new oi6("set-cookie", ""), new oi6("strict-transport-security", ""), new oi6("transfer-encoding", ""), new oi6("user-agent", ""), new oi6("vary", ""), new oi6("via", ""), new oi6("www-authenticate", "")};
        a = oi6VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(oi6VarArr[i].a)) {
                linkedHashMap.put(oi6VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static void a(a71 a71Var) throws IOException {
        a71Var.getClass();
        int iE = a71Var.e();
        for (int i = 0; i < iE; i++) {
            byte bK = a71Var.k(i);
            if (65 <= bK && bK < 91) {
                yg5.m("PROTOCOL_ERROR response malformed: mixed case name: ".concat(a71Var.t()));
                return;
            }
        }
    }
}
