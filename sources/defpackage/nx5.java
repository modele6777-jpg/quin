package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nx5 extends vb2 {
    public boolean M0;
    public boolean N0;
    public final vd9 K0 = new vd9(20, new mx5(this));
    public final a58 L0 = new a58(this, true);
    public boolean O0 = true;

    public nx5() {
        final int i = 1;
        ((vea) this.d.c).A("android:support:lifecycle", new pb2(2, this));
        final int i2 = 0;
        this.x.add(new yl2(this) { // from class: lx5
            public final /* synthetic */ nx5 b;

            {
                this.b = this;
            }

            @Override // defpackage.yl2
            public final void accept(Object obj) {
                int i3 = i2;
                nx5 nx5Var = this.b;
                switch (i3) {
                    case 0:
                        nx5Var.K0.C();
                        break;
                    default:
                        nx5Var.K0.C();
                        break;
                }
            }
        });
        this.z.add(new yl2(this) { // from class: lx5
            public final /* synthetic */ nx5 b;

            {
                this.b = this;
            }

            @Override // defpackage.yl2
            public final void accept(Object obj) {
                int i3 = i;
                nx5 nx5Var = this.b;
                switch (i3) {
                    case 0:
                        nx5Var.K0.C();
                        break;
                    default:
                        nx5Var.K0.C();
                        break;
                }
            }
        });
        m(new qb2(this, i));
    }

    public static boolean r(zx5 zx5Var) {
        boolean zR = false;
        for (kx5 kx5Var : zx5Var.c.K()) {
            if (kx5Var != null) {
                mx5 mx5Var = kx5Var.J0;
                if ((mx5Var == null ? null : mx5Var.K0) != null) {
                    zR |= r(kx5Var.f());
                }
                if (kx5Var.c1.i.compareTo(g48.d) >= 0) {
                    kx5Var.c1.g(g48.c);
                    zR = true;
                }
            }
        }
        return zR;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.M0);
        printWriter.print(" mResumed=");
        printWriter.print(this.N0);
        printWriter.print(" mStopped=");
        printWriter.print(this.O0);
        if (getApplication() != null) {
            new fz3(this, g()).p(str3, printWriter);
        }
        ((mx5) this.K0.b).J0.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.vb2, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.K0.C();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.vb2, defpackage.ub2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.L0.e(f48.ON_CREATE);
        zx5 zx5Var = ((mx5) this.K0.b).J0;
        zx5Var.H = false;
        zx5Var.I = false;
        zx5Var.O.g = false;
        zx5Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        ox5 ox5Var = (ox5) ((mx5) this.K0.b).J0.f.onCreateView(null, str, context, attributeSet);
        return ox5Var == null ? super.onCreateView(str, context, attributeSet) : ox5Var;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((mx5) this.K0.b).J0.l();
        this.L0.e(f48.ON_DESTROY);
    }

    @Override // defpackage.vb2, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((mx5) this.K0.b).J0.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.N0 = false;
        ((mx5) this.K0.b).J0.u(5);
        this.L0.e(f48.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.L0.e(f48.ON_RESUME);
        zx5 zx5Var = ((mx5) this.K0.b).J0;
        zx5Var.H = false;
        zx5Var.I = false;
        zx5Var.O.g = false;
        zx5Var.u(7);
    }

    @Override // defpackage.vb2, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.K0.C();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        vd9 vd9Var = this.K0;
        vd9Var.C();
        super.onResume();
        this.N0 = true;
        ((mx5) vd9Var.b).J0.z(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        vd9 vd9Var = this.K0;
        vd9Var.C();
        mx5 mx5Var = (mx5) vd9Var.b;
        super.onStart();
        this.O0 = false;
        if (!this.M0) {
            this.M0 = true;
            zx5 zx5Var = mx5Var.J0;
            zx5Var.H = false;
            zx5Var.I = false;
            zx5Var.O.g = false;
            zx5Var.u(4);
        }
        mx5Var.J0.z(true);
        this.L0.e(f48.ON_START);
        zx5 zx5Var2 = mx5Var.J0;
        zx5Var2.H = false;
        zx5Var2.I = false;
        zx5Var2.O.g = false;
        zx5Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.K0.C();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.O0 = true;
        while (r(q())) {
        }
        zx5 zx5Var = ((mx5) this.K0.b).J0;
        zx5Var.I = true;
        zx5Var.O.g = true;
        zx5Var.u(4);
        this.L0.e(f48.ON_STOP);
    }

    public final zx5 q() {
        return ((mx5) this.K0.b).J0;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        ox5 ox5Var = (ox5) ((mx5) this.K0.b).J0.f.onCreateView(view, str, context, attributeSet);
        return ox5Var == null ? super.onCreateView(view, str, context, attributeSet) : ox5Var;
    }
}
