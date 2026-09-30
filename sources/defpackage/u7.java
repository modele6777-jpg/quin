package defpackage;

import tech.chatmind.api.Gender;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u7 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9 b;
    public final /* synthetic */ x16 c;

    public /* synthetic */ u7(x9 x9Var, x16 x16Var, int i) {
        this.a = i;
        this.b = x9Var;
        this.c = x16Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.c;
        x9 x9Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                x9Var.getClass();
                x16Var.getClass();
                x9Var.f(ngf.d, str, new p9(2, x16Var));
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                x9Var.getClass();
                x16Var.getClass();
                x9Var.f(ngf.c, str2, new p9(1, x16Var));
                break;
            default:
                Gender gender = (Gender) obj;
                gender.getClass();
                x9Var.getClass();
                x16Var.getClass();
                x9Var.f(ngf.b, gender.name(), new p9(0, x16Var));
                break;
        }
        return wefVar;
    }
}
