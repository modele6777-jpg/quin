package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xa6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ xa6(int i, a26 a26Var, String str) {
        this.a = i;
        this.b = str;
        this.c = a26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        a26 a26Var = this.c;
        String str = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                l1fVar.getClass();
                l1fVar.a(str, "btn");
                a26Var.d(l1fVar);
                break;
            default:
                l1fVar.getClass();
                Locale locale = Locale.ROOT;
                locale.getClass();
                String upperCase = str.toUpperCase(locale);
                upperCase.getClass();
                l1fVar.a(upperCase, "code");
                a26Var.d(l1fVar);
                break;
        }
        return wefVar;
    }
}
