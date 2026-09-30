package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j6 {
    public Object a;
    public Object b;

    public j6(int i) {
        switch (i) {
            case 5:
                this.a = vpf.n(1);
                this.b = new za2();
                break;
            case 6:
                this.a = new CopyOnWriteArraySet();
                this.b = new CopyOnWriteArraySet();
                break;
            default:
                this.b = new int[2];
                break;
        }
    }

    public void d(String str) {
        ((CopyOnWriteArraySet) this.a).add(str);
        ((CopyOnWriteArraySet) this.b).remove(str);
    }

    public void e() {
        n80 n80Var = (n80) this.a;
        if (n80Var != null) {
            try {
                ((q80) this.b).y.unregisterReceiver(n80Var);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter f();

    public void g() {
        if (wh0.b.decrementAndGet((wh0) this.a) == 0) {
            ((za2) this.b).R(new tt9(new vt9(2)));
            t();
        }
    }

    public abstract int[] h(int i);

    public abstract int i();

    public MenuItem j(MenuItem menuItem) {
        if (!(menuItem instanceof d9e)) {
            return menuItem;
        }
        d9e d9eVar = (d9e) menuItem;
        wid widVar = (wid) this.b;
        if (widVar == null) {
            widVar = new wid(0);
            this.b = widVar;
        }
        MenuItem menuItem2 = (MenuItem) widVar.get(d9eVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        zr8 zr8Var = new zr8((Context) this.a, d9eVar);
        ((wid) this.b).put(d9eVar, zr8Var);
        return zr8Var;
    }

    public int[] k(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String l() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        pa7.g0("text");
        throw null;
    }

    public boolean m() {
        return ((yr0) this.a).b && ((xr0) this.b).b;
    }

    public abstract void o();

    public abstract void r();

    public abstract int[] s(int i);

    public abstract void t();

    public void u(boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.a;
        if (z) {
            copyOnWriteArraySet2.add("android.widget.ImageView");
            copyOnWriteArraySet.remove("android.widget.ImageView");
        } else {
            copyOnWriteArraySet.add("android.widget.ImageView");
            copyOnWriteArraySet2.remove("android.widget.ImageView");
        }
    }

    public void v(boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.a;
        if (z) {
            copyOnWriteArraySet2.add("android.widget.TextView");
            copyOnWriteArraySet.remove("android.widget.TextView");
        } else {
            copyOnWriteArraySet.add("android.widget.TextView");
            copyOnWriteArraySet2.remove("android.widget.TextView");
        }
    }

    public void w() {
        e();
        IntentFilter intentFilterF = f();
        if (intentFilterF.countActions() == 0) {
            return;
        }
        n80 n80Var = (n80) this.a;
        if (n80Var == null) {
            n80Var = new n80(0, this);
            this.a = n80Var;
        }
        ((q80) this.b).y.registerReceiver(n80Var, intentFilterF);
    }

    public abstract void x();

    public void n() {
    }

    public void q() {
    }

    public void p(wr0 wr0Var) {
    }

    public j6(Context context) {
        this.a = context;
    }

    public j6(m93 m93Var) {
        this.a = new yr0(0, this);
        this.b = new xr0(this, m93Var);
    }

    public j6(String str, Bundle bundle) {
        bundle.getClass();
        this.a = str;
        this.b = bundle;
    }

    public j6(q80 q80Var) {
        this.b = q80Var;
    }
}
