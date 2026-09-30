package defpackage;

import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n8b extends ov8 implements hf8 {
    public static void c(String str, String str2) {
        PersistentCookieJar persistentCookieJar = jk9.a;
        bt6 bt6Var = new bt6();
        bt6Var.d(null, str2);
        ct6 ct6VarA = bt6Var.a();
        bt6 bt6Var2 = new bt6();
        bt6Var2.d(null, str);
        List listD = persistentCookieJar.d(bt6Var2.a());
        ArrayList arrayList = new ArrayList(t72.u(listD, 10));
        for (eu2 eu2Var : (ArrayList) listD) {
            du2 du2Var = new du2();
            du2Var.d(eu2Var.a);
            du2Var.f(eu2Var.b);
            if (eu2Var.i) {
                bt6 bt6Var3 = new bt6();
                bt6Var3.d(null, str2);
                String str3 = bt6Var3.a().d;
                str3.getClass();
                du2Var.b(str3, true);
            } else {
                bt6 bt6Var4 = new bt6();
                bt6Var4.d(null, str2);
                String str4 = bt6Var4.a().d;
                str4.getClass();
                du2Var.b(str4, false);
            }
            du2Var.e(eu2Var.e);
            du2Var.c(eu2Var.c);
            if (eu2Var.f) {
                du2Var.f = true;
            }
            if (eu2Var.g) {
                du2Var.g = true;
            }
            arrayList.add(du2Var.a());
        }
        persistentCookieJar.c(ct6VarA, arrayList);
    }

    @Override // defpackage.ov8
    public final int a() {
        return 91;
    }

    @Override // defpackage.ov8
    public final void b() {
        d().e("Migrate QuinLove cookies");
        PersistentCookieJar persistentCookieJar = jk9.a;
        c("https://askquin.ai", "https://quin.love");
        c("https://askquin.cn", "https://quinlove.cn");
        c("https://staging.askquin.ai", "https://staging.quin.love");
        c("https://staging.askquin.cn", "https://staging.quinlove.cn");
    }
}
