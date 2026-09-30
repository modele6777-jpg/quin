package defpackage;

import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cd {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public Object c;

    public cd(String str, boolean z) {
        this.c = str;
        this.b = z;
    }

    public Integer a(cd cdVar) {
        cdVar.getClass();
        fl8 fl8Var = oyf.a;
        if (this == cdVar) {
            return 0;
        }
        fl8 fl8Var2 = oyf.a;
        Integer num = (Integer) fl8Var2.get(this);
        Integer num2 = (Integer) fl8Var2.get(cdVar);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public abstract void b();

    public abstract View d();

    public String e() {
        return (String) this.c;
    }

    public abstract qr8 f();

    public abstract MenuInflater g();

    public abstract CharSequence h();

    public abstract CharSequence i();

    public abstract void j();

    public abstract boolean k();

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public abstract void p(int i);

    public abstract void q(CharSequence charSequence);

    public abstract void r(boolean z);

    public String toString() {
        switch (this.a) {
            case 1:
                return e();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ cd() {
    }

    public cd l() {
        return this;
    }
}
