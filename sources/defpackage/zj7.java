package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zj7 implements x16 {
    public final /* synthetic */ int a;
    public final bk7 b;

    public /* synthetic */ zj7(bk7 bk7Var, int i) {
        this.a = i;
        this.b = bk7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        bk7 bk7Var = this.b;
        switch (i) {
            case 0:
                List listH = t72.H(e10.a(bk7Var.a.e, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                return listH.isEmpty() ? hj6.c : new j10(0, listH);
            default:
                return bk7Var.a.e.e();
        }
    }
}
