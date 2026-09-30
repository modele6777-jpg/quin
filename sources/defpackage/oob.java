package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oob implements x16 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ oob(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        String str;
        int i = this.a;
        String str2 = this.b;
        switch (i) {
            case 0:
                String strL = ub3.l(new StringBuilder(), tyd.m.a.a, '.');
                str = c5e.C(str2, strL, false) ? strL : null;
                return str == null ? "" : str;
            default:
                String strL2 = ub3.l(new StringBuilder(), tyd.k.a.a, '.');
                str = c5e.C(str2, strL2, false) ? strL2 : null;
                return str == null ? "" : str;
        }
    }
}
