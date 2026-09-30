package defpackage;

import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.adjust.sdk.sig.r3;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a58 extends h48 {
    public final boolean b;
    public ta0 c;
    public final fnb d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public g48 i;
    public final s0e j;

    public a58(x48 x48Var, boolean z) {
        this.a = new kd9(4);
        this.b = z;
        this.c = new ta0(24);
        x48Var.getClass();
        fnb fnbVar = new fnb();
        fnbVar.a = new WeakReference(x48Var);
        this.d = fnbVar;
        this.h = new ArrayList();
        g48 g48Var = g48.b;
        this.i = g48Var;
        this.j = t0e.a(g48Var);
    }

    @Override // defpackage.h48
    public final void a(w48 w48Var) {
        u48 rr3Var;
        z48 z48Var;
        x48 x48Var;
        f48 f48Var;
        w48Var.getClass();
        d("addObserver");
        g48 g48Var = this.i;
        g48 g48Var2 = g48.a;
        if (g48Var != g48Var2) {
            g48Var2 = g48.b;
        }
        z48 z48Var2 = new z48();
        z48Var2.a = g48Var2;
        HashMap map = j58.a;
        boolean z = w48Var instanceof u48;
        boolean z2 = w48Var instanceof DefaultLifecycleObserver;
        int i = 2;
        Object obj = null;
        int i2 = 0;
        if (z && z2) {
            rr3Var = new rr3(i2, (DefaultLifecycleObserver) w48Var, (u48) w48Var);
        } else if (z2) {
            rr3Var = new rr3(i2, (DefaultLifecycleObserver) w48Var, obj);
        } else if (z) {
            rr3Var = (u48) w48Var;
        } else {
            Class<?> cls = w48Var.getClass();
            if (j58.b(cls) == 2) {
                Object obj2 = j58.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    j58.a((Constructor) list.get(0), w48Var);
                    throw null;
                }
                int size = list.size();
                h56[] h56VarArr = new h56[size];
                if (size > 0) {
                    j58.a((Constructor) list.get(0), w48Var);
                    throw null;
                }
                rr3Var = new gkb(i, h56VarArr);
            } else {
                rr3Var = new rr3(w48Var);
            }
        }
        z48Var2.b = rr3Var;
        ta0 ta0Var = this.c;
        ta0Var.getClass();
        w79 w79Var = (w79) ta0Var.c;
        qa5 qa5Var = (qa5) w79Var.g(w48Var);
        if (qa5Var != null) {
            z48Var = qa5Var.b;
        } else {
            qa5 qa5Var2 = new qa5(w48Var, z48Var2);
            w79Var.m(w48Var, qa5Var2);
            qa5 qa5Var3 = (qa5) ta0Var.b;
            if (qa5Var3 == null) {
                ta0Var.d = qa5Var2;
                ta0Var.b = qa5Var2;
            } else {
                qa5Var3.c = qa5Var2;
                qa5Var2.d = qa5Var3;
                ta0Var.b = qa5Var2;
            }
            z48Var = null;
        }
        if (z48Var == null && (x48Var = (x48) ((WeakReference) this.d.a).get()) != null) {
            i2 = (this.e != 0 || this.f) ? 1 : 0;
            g48 g48VarC = c(w48Var);
            this.e++;
            while (z48Var2.a.compareTo(g48VarC) < 0) {
                ta0 ta0Var2 = this.c;
                ta0Var2.getClass();
                if (!((w79) ta0Var2.c).c(w48Var)) {
                    break;
                }
                g48 g48Var3 = z48Var2.a;
                ArrayList arrayList = this.h;
                arrayList.add(g48Var3);
                d48 d48Var = f48.Companion;
                g48 g48Var4 = z48Var2.a;
                d48Var.getClass();
                g48Var4.getClass();
                int iOrdinal = g48Var4.ordinal();
                if (iOrdinal == 1) {
                    f48Var = f48.ON_CREATE;
                } else if (iOrdinal != 2) {
                    f48Var = iOrdinal != 3 ? null : f48.ON_RESUME;
                } else {
                    f48Var = f48.ON_START;
                }
                if (f48Var == null) {
                    s8f.h(z48Var2.a, "no event up from ");
                    return;
                } else {
                    z48Var2.a(x48Var, f48Var);
                    x72.l0(arrayList);
                    g48VarC = c(w48Var);
                }
            }
            if (i2 == 0) {
                h();
            }
            this.e--;
        }
    }

    @Override // defpackage.h48
    public final void b(w48 w48Var) {
        w48Var.getClass();
        d("removeObserver");
        ta0 ta0Var = this.c;
        ta0Var.getClass();
        qa5 qa5Var = (qa5) ((w79) ta0Var.c).k(w48Var);
        if (qa5Var == null) {
            return;
        }
        qa5 qa5Var2 = qa5Var.d;
        qa5 qa5Var3 = qa5Var.c;
        if (qa5Var2 == null) {
            ta0Var.d = qa5Var3;
        } else {
            qa5Var2.c = qa5Var3;
        }
        qa5 qa5Var4 = qa5Var.c;
        if (qa5Var4 == null) {
            ta0Var.b = qa5Var2;
        } else {
            qa5Var4.d = qa5Var2;
        }
        qa5Var.e = true;
    }

    public final g48 c(w48 w48Var) {
        ta0 ta0Var = this.c;
        ta0Var.getClass();
        w48Var.getClass();
        qa5 qa5Var = (qa5) ((w79) ta0Var.c).g(w48Var);
        qa5 qa5Var2 = qa5Var != null ? qa5Var.d : null;
        g48 g48Var = qa5Var2 != null ? qa5Var2.b.a : null;
        ArrayList arrayList = this.h;
        g48 g48Var2 = arrayList.isEmpty() ? null : (g48) ks0.f(1, arrayList);
        g48 g48Var3 = this.i;
        if (g48Var == null || g48Var.compareTo(g48Var3) >= 0) {
            g48Var = g48Var3;
        }
        return (g48Var2 == null || g48Var2.compareTo(g48Var) >= 0) ? g48Var : g48Var2;
    }

    public final void d(String str) {
        if (this.b) {
            gt3 gt3Var = nc0.o().a;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            ho7.j(ib8.j("Method ", str, " must be called on the main thread"));
        }
    }

    public final void e(f48 f48Var) {
        f48Var.getClass();
        d("handleLifecycleEvent");
        f(f48Var.a());
    }

    public final void f(g48 g48Var) {
        if (this.i == g48Var) {
            return;
        }
        x48 x48Var = (x48) ((WeakReference) this.d.a).get();
        g48 g48Var2 = this.i;
        g48 g48Var3 = g48.b;
        g48 g48Var4 = g48.a;
        if (g48Var2 == g48Var3 && g48Var == g48Var4) {
            throw new IllegalStateException(("State must be at least '" + g48.c + "' to be moved to '" + g48Var + "' in component " + x48Var).toString());
        }
        if (g48Var2 == g48Var4 && g48Var2 != g48Var) {
            throw new IllegalStateException(("State is '" + g48Var4 + "' and cannot be moved to `" + g48Var + "` in component " + x48Var).toString());
        }
        this.i = g48Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        h();
        this.f = false;
        if (this.i == g48Var4) {
            this.c = new ta0(24);
        }
    }

    public final void g(g48 g48Var) {
        g48Var.getClass();
        d("setCurrentState");
        f(g48Var);
    }

    public final void h() {
        Object obj = ((WeakReference) this.d.a).get();
        if (obj == null) {
            qc0.p("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final x48 x48Var = (x48) obj;
        while (true) {
            ta0 ta0Var = this.c;
            final int i = 0;
            if (((w79) ta0Var.c).e == 0) {
                break;
            }
            qa5 qa5Var = (qa5) ta0Var.d;
            if (qa5Var == null) {
                r3.n("Collection is empty.");
                return;
            }
            g48 g48Var = qa5Var.b.a;
            qa5 qa5Var2 = (qa5) ta0Var.b;
            if (qa5Var2 == null) {
                r3.n("Collection is empty.");
                return;
            }
            g48 g48Var2 = qa5Var2.b.a;
            if (g48Var == g48Var2 && this.i == g48Var2) {
                break;
            }
            this.g = false;
            g48 g48Var3 = this.i;
            if (qa5Var == null) {
                r3.n("Collection is empty.");
                return;
            }
            if (g48Var3.compareTo(g48Var) < 0) {
                ta0 ta0Var2 = this.c;
                a26 a26Var = new a26(this) { // from class: y48
                    public final /* synthetic */ a58 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.a26
                    public final Object d(Object obj2) {
                        f48 f48Var;
                        f48 f48Var2;
                        int i2 = i;
                        wef wefVar = wef.a;
                        x48 x48Var2 = x48Var;
                        a58 a58Var = this.b;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i2) {
                            case 0:
                                entry.getClass();
                                w48 w48Var = (w48) entry.getKey();
                                z48 z48Var = (z48) entry.getValue();
                                while (true) {
                                    g48 g48Var4 = z48Var.a;
                                    g48 g48Var5 = a58Var.i;
                                    ArrayList arrayList = a58Var.h;
                                    if (g48Var4.compareTo(g48Var5) <= 0 || a58Var.g) {
                                        return wefVar;
                                    }
                                    ta0 ta0Var3 = a58Var.c;
                                    ta0Var3.getClass();
                                    w48Var.getClass();
                                    if (!((w79) ta0Var3.c).c(w48Var)) {
                                        return wefVar;
                                    }
                                    d48 d48Var = f48.Companion;
                                    g48 g48Var6 = z48Var.a;
                                    d48Var.getClass();
                                    g48Var6.getClass();
                                    int iOrdinal = g48Var6.ordinal();
                                    if (iOrdinal == 2) {
                                        f48Var = f48.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        f48Var = iOrdinal != 4 ? null : f48.ON_PAUSE;
                                    } else {
                                        f48Var = f48.ON_STOP;
                                    }
                                    if (f48Var == null) {
                                        ho7.w(z48Var.a, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(f48Var.a());
                                    z48Var.a(x48Var2, f48Var);
                                    x72.l0(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                w48 w48Var2 = (w48) entry.getKey();
                                z48 z48Var2 = (z48) entry.getValue();
                                while (true) {
                                    g48 g48Var7 = z48Var2.a;
                                    g48 g48Var8 = a58Var.i;
                                    ArrayList arrayList2 = a58Var.h;
                                    if (g48Var7.compareTo(g48Var8) >= 0 || a58Var.g) {
                                        return wefVar;
                                    }
                                    ta0 ta0Var4 = a58Var.c;
                                    ta0Var4.getClass();
                                    w48Var2.getClass();
                                    if (!((w79) ta0Var4.c).c(w48Var2)) {
                                        return wefVar;
                                    }
                                    arrayList2.add(z48Var2.a);
                                    d48 d48Var2 = f48.Companion;
                                    g48 g48Var9 = z48Var2.a;
                                    d48Var2.getClass();
                                    g48Var9.getClass();
                                    int iOrdinal2 = g48Var9.ordinal();
                                    if (iOrdinal2 == 1) {
                                        f48Var2 = f48.ON_CREATE;
                                    } else if (iOrdinal2 != 2) {
                                        f48Var2 = iOrdinal2 != 3 ? null : f48.ON_RESUME;
                                    } else {
                                        f48Var2 = f48.ON_START;
                                    }
                                    if (f48Var2 == null) {
                                        ho7.w(z48Var2.a, "no event up from ");
                                        return null;
                                    }
                                    z48Var2.a(x48Var2, f48Var2);
                                    x72.l0(arrayList2);
                                }
                                break;
                        }
                    }
                };
                ta0Var2.getClass();
                for (qa5 qa5Var3 = (qa5) ta0Var2.b; qa5Var3 != null; qa5Var3 = qa5Var3.d) {
                    if (!qa5Var3.e) {
                        a26Var.d(qa5Var3);
                    }
                }
            }
            qa5 qa5Var4 = (qa5) this.c.b;
            if (!this.g && qa5Var4 != null && this.i.compareTo(qa5Var4.b.a) > 0) {
                ta0 ta0Var3 = this.c;
                final int i2 = 1;
                a26 a26Var2 = new a26(this) { // from class: y48
                    public final /* synthetic */ a58 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.a26
                    public final Object d(Object obj2) {
                        f48 f48Var;
                        f48 f48Var2;
                        int i3 = i2;
                        wef wefVar = wef.a;
                        x48 x48Var2 = x48Var;
                        a58 a58Var = this.b;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i3) {
                            case 0:
                                entry.getClass();
                                w48 w48Var = (w48) entry.getKey();
                                z48 z48Var = (z48) entry.getValue();
                                while (true) {
                                    g48 g48Var4 = z48Var.a;
                                    g48 g48Var5 = a58Var.i;
                                    ArrayList arrayList = a58Var.h;
                                    if (g48Var4.compareTo(g48Var5) <= 0 || a58Var.g) {
                                        return wefVar;
                                    }
                                    ta0 ta0Var4 = a58Var.c;
                                    ta0Var4.getClass();
                                    w48Var.getClass();
                                    if (!((w79) ta0Var4.c).c(w48Var)) {
                                        return wefVar;
                                    }
                                    d48 d48Var = f48.Companion;
                                    g48 g48Var6 = z48Var.a;
                                    d48Var.getClass();
                                    g48Var6.getClass();
                                    int iOrdinal = g48Var6.ordinal();
                                    if (iOrdinal == 2) {
                                        f48Var = f48.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        f48Var = iOrdinal != 4 ? null : f48.ON_PAUSE;
                                    } else {
                                        f48Var = f48.ON_STOP;
                                    }
                                    if (f48Var == null) {
                                        ho7.w(z48Var.a, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(f48Var.a());
                                    z48Var.a(x48Var2, f48Var);
                                    x72.l0(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                w48 w48Var2 = (w48) entry.getKey();
                                z48 z48Var2 = (z48) entry.getValue();
                                while (true) {
                                    g48 g48Var7 = z48Var2.a;
                                    g48 g48Var8 = a58Var.i;
                                    ArrayList arrayList2 = a58Var.h;
                                    if (g48Var7.compareTo(g48Var8) >= 0 || a58Var.g) {
                                        return wefVar;
                                    }
                                    ta0 ta0Var5 = a58Var.c;
                                    ta0Var5.getClass();
                                    w48Var2.getClass();
                                    if (!((w79) ta0Var5.c).c(w48Var2)) {
                                        return wefVar;
                                    }
                                    arrayList2.add(z48Var2.a);
                                    d48 d48Var2 = f48.Companion;
                                    g48 g48Var9 = z48Var2.a;
                                    d48Var2.getClass();
                                    g48Var9.getClass();
                                    int iOrdinal2 = g48Var9.ordinal();
                                    if (iOrdinal2 == 1) {
                                        f48Var2 = f48.ON_CREATE;
                                    } else if (iOrdinal2 != 2) {
                                        f48Var2 = iOrdinal2 != 3 ? null : f48.ON_RESUME;
                                    } else {
                                        f48Var2 = f48.ON_START;
                                    }
                                    if (f48Var2 == null) {
                                        ho7.w(z48Var2.a, "no event up from ");
                                        return null;
                                    }
                                    z48Var2.a(x48Var2, f48Var2);
                                    x72.l0(arrayList2);
                                }
                                break;
                        }
                    }
                };
                ta0Var3.getClass();
                for (qa5 qa5Var5 = (qa5) ta0Var3.d; qa5Var5 != null; qa5Var5 = qa5Var5.c) {
                    if (!qa5Var5.e) {
                        a26Var2.d(qa5Var5);
                    }
                }
            }
        }
        this.g = false;
        this.j.m(this.i);
    }
}
