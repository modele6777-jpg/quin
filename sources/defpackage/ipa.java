package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ipa implements a26 {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public /* synthetic */ ipa(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        String str = this.c;
        String str2 = this.b;
        nid nidVar = (nid) obj;
        switch (i) {
            case 0:
                nidVar.getClass();
                wf7 wf7Var = kpa.b;
                nidVar.a(str2, wf7Var);
                wf7 wf7Var2 = kpa.a;
                nidVar.a(str, wf7Var, wf7Var, wf7Var2, wf7Var2);
                nidVar.c(str2, wf7Var2);
                break;
            case 1:
                nidVar.getClass();
                wf7 wf7Var3 = kpa.b;
                nidVar.a(str2, wf7Var3);
                nidVar.a(str, wf7Var3, wf7Var3, wf7Var3);
                nidVar.c(str2, wf7Var3);
                break;
            case 2:
                nidVar.getClass();
                wf7 wf7Var4 = kpa.b;
                nidVar.a(str2, wf7Var4);
                wf7 wf7Var5 = kpa.c;
                wf7 wf7Var6 = kpa.a;
                nidVar.a(str, wf7Var4, wf7Var4, wf7Var5, wf7Var6);
                nidVar.c(str2, wf7Var6);
                break;
            case 3:
                nidVar.getClass();
                wf7 wf7Var7 = kpa.b;
                nidVar.a(str2, wf7Var7);
                wf7 wf7Var8 = kpa.c;
                nidVar.a(str2, wf7Var8);
                wf7 wf7Var9 = kpa.a;
                nidVar.a(str, wf7Var7, wf7Var8, wf7Var8, wf7Var9);
                nidVar.c(str2, wf7Var9);
                break;
            case 4:
                nidVar.getClass();
                wf7 wf7Var10 = kpa.c;
                nidVar.a(str2, wf7Var10);
                nidVar.c(str, kpa.b, wf7Var10);
                break;
            default:
                nidVar.getClass();
                nidVar.a(str2, kpa.a);
                nidVar.c(str, kpa.b, kpa.c);
                break;
        }
        return wefVar;
    }
}
