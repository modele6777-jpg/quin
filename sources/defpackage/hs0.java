package defpackage;

import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hs0 implements wx5 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final zx5 q;
    public boolean r;
    public int s;

    public hs0(zx5 zx5Var) {
        zx5Var.F();
        mx5 mx5Var = zx5Var.w;
        if (mx5Var != null) {
            mx5Var.H0.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = zx5Var;
    }

    @Override // defpackage.wx5
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (zx5.I(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.q.d.add(this);
        return true;
    }

    public final void b(ky5 ky5Var) {
        this.a.add(ky5Var);
        ky5Var.d = this.b;
        ky5Var.e = this.c;
        ky5Var.f = this.d;
        ky5Var.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (zx5.I(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ky5 ky5Var = (ky5) arrayList.get(i2);
                kx5 kx5Var = ky5Var.b;
                if (kx5Var != null) {
                    kx5Var.H0 += i;
                    if (zx5.I(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + ky5Var.b + " to " + ky5Var.b.H0);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            ky5 ky5Var = (ky5) arrayList.get(size);
            if (ky5Var.c) {
                if (ky5Var.a == 8) {
                    ky5Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = ky5Var.b.N0;
                    ky5Var.a = 2;
                    ky5Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        ky5 ky5Var2 = (ky5) arrayList.get(i2);
                        if (ky5Var2.c && ky5Var2.b.N0 == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int e(boolean z, boolean z2) {
        if (this.r) {
            qc0.p("commit already called");
            return 0;
        }
        if (zx5.I(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new bf8());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z3 = this.g;
        zx5 zx5Var = this.q;
        if (z3) {
            this.s = zx5Var.k.getAndIncrement();
        } else {
            this.s = -1;
        }
        if (z2) {
            zx5Var.x(this, z);
        }
        return this.s;
    }

    public final void f(int i, kx5 kx5Var, String str) {
        String str2 = kx5Var.a1;
        if (str2 != null) {
            hy5 hy5Var = iy5.a;
            iy5.b(new dy5(kx5Var, str2));
            iy5.a(kx5Var).getClass();
        }
        Class<?> cls = kx5Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = kx5Var.O0;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(kx5Var);
                sb.append(": was ");
                qc0.p(ib8.m(sb, kx5Var.O0, " now ", str));
                return;
            }
            kx5Var.O0 = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + kx5Var + " with tag " + str + " to container view with no id");
            }
            int i2 = kx5Var.M0;
            if (i2 != 0 && i2 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(kx5Var);
                int i3 = kx5Var.M0;
                sb2.append(": was ");
                sb2.append(i3);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            kx5Var.M0 = i;
            kx5Var.N0 = i;
        }
        b(new ky5(1, kx5Var));
        kx5Var.I0 = this.q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ky5 ky5Var = (ky5) arrayList.get(i);
            switch (ky5Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + ky5Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(ky5Var.b);
            if (z) {
                if (ky5Var.d != 0 || ky5Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(ky5Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(ky5Var.e));
                }
                if (ky5Var.f != 0 || ky5Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(ky5Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(ky5Var.g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
