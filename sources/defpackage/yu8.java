package defpackage;

import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yu8 implements lw6, fs5 {
    public final ArrayList X;
    public final Object a;
    public final ie1 b;
    public int c;
    public final r45 d;
    public boolean e;
    public final egh f;
    public kw6 g;
    public Executor v;
    public final LongSparseArray w;
    public final LongSparseArray x;
    public int y;
    public final ArrayList z;

    public yu8(int i, int i2, int i3, int i4) {
        egh eghVar = new egh(ImageReader.newInstance(i, i2, i3, i4));
        this.a = new Object();
        this.b = new ie1(2, this);
        this.c = 0;
        this.d = new r45(12, this);
        this.e = false;
        this.w = new LongSparseArray();
        this.x = new LongSparseArray();
        this.X = new ArrayList();
        this.f = eghVar;
        this.y = 0;
        this.z = new ArrayList(v0());
    }

    @Override // defpackage.lw6
    public final iw6 A0() {
        synchronized (this.a) {
            try {
                if (this.z.isEmpty()) {
                    return null;
                }
                if (this.y >= this.z.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.z;
                int i = this.y;
                this.y = i + 1;
                iw6 iw6Var = (iw6) arrayList.get(i);
                this.X.add(iw6Var);
                return iw6Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lw6
    public final void B() {
        synchronized (this.a) {
            this.f.B();
            this.g = null;
            this.v = null;
            this.c = 0;
        }
    }

    @Override // defpackage.fs5
    public final void a(gs5 gs5Var) {
        synchronized (this.a) {
            b(gs5Var);
        }
    }

    public final void b(gs5 gs5Var) {
        synchronized (this.a) {
            try {
                int iIndexOf = this.z.indexOf(gs5Var);
                if (iIndexOf >= 0) {
                    this.z.remove(iIndexOf);
                    int i = this.y;
                    if (iIndexOf <= i) {
                        this.y = i - 1;
                    }
                }
                this.X.remove(gs5Var);
                if (this.c > 0) {
                    f(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lw6
    public final int c() {
        int iC;
        synchronized (this.a) {
            iC = this.f.c();
        }
        return iC;
    }

    @Override // defpackage.lw6
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = new ArrayList(this.z).iterator();
                while (it.hasNext()) {
                    ((iw6) it.next()).close();
                }
                this.z.clear();
                this.f.close();
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lw6
    public final int d() {
        int iD;
        synchronized (this.a) {
            iD = this.f.d();
        }
        return iD;
    }

    public final void e(p3d p3dVar) {
        kw6 kw6Var;
        Executor executor;
        synchronized (this.a) {
            try {
                if (this.z.size() < v0()) {
                    p3dVar.b(this);
                    this.z.add(p3dVar);
                    kw6Var = this.g;
                    executor = this.v;
                } else {
                    b21.q("TAG", "Maximum image number reached.");
                    p3dVar.close();
                    kw6Var = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kw6Var != null) {
            if (executor != null) {
                executor.execute(new xu8(0, this, kw6Var));
            } else {
                kw6Var.l(this);
            }
        }
    }

    public final void f(lw6 lw6Var) {
        iw6 iw6VarA0;
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                int size = this.x.size() + this.z.size();
                if (size >= lw6Var.v0()) {
                    b21.q("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        iw6VarA0 = lw6Var.A0();
                        if (iw6VarA0 != null) {
                            this.c--;
                            size++;
                            this.x.put(iw6VarA0.u0().i(), iw6VarA0);
                            g();
                        }
                    } catch (IllegalStateException e) {
                        if (b21.F(3, "MetadataImageReader")) {
                            Log.d("MetadataImageReader", "Failed to acquire next image.", e);
                        }
                        iw6VarA0 = null;
                    }
                    if (iw6VarA0 == null || this.c <= 0) {
                        break;
                    }
                } while (size < lw6Var.v0());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.a) {
            try {
                for (int size = this.w.size() - 1; size >= 0; size--) {
                    vv6 vv6Var = (vv6) this.w.valueAt(size);
                    long jI = vv6Var.i();
                    iw6 iw6Var = (iw6) this.x.get(jI);
                    if (iw6Var != null) {
                        this.x.remove(jI);
                        this.w.removeAt(size);
                        e(new p3d(iw6Var, null, vv6Var));
                    }
                }
                h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lw6
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.f.getSurface();
        }
        return surface;
    }

    public final void h() {
        synchronized (this.a) {
            try {
                if (this.x.size() != 0 && this.w.size() != 0) {
                    long jKeyAt = this.x.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.w.keyAt(0);
                    ok8.l(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.x.size() - 1; size >= 0; size--) {
                            if (this.x.keyAt(size) < jKeyAt2) {
                                ((iw6) this.x.valueAt(size)).close();
                                this.x.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.w.size() - 1; size2 >= 0; size2--) {
                            if (this.w.keyAt(size2) < jKeyAt) {
                                this.w.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lw6
    public final void h0(kw6 kw6Var, Executor executor) {
        synchronized (this.a) {
            kw6Var.getClass();
            this.g = kw6Var;
            executor.getClass();
            this.v = executor;
            this.f.h0(this.d, executor);
        }
    }

    @Override // defpackage.lw6
    public final iw6 q() {
        synchronized (this.a) {
            try {
                if (this.z.isEmpty()) {
                    return null;
                }
                if (this.y >= this.z.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.z.size() - 1; i++) {
                    if (!this.X.contains(this.z.get(i))) {
                        arrayList.add((iw6) this.z.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((iw6) it.next()).close();
                }
                int size = this.z.size();
                ArrayList arrayList2 = this.z;
                this.y = size;
                iw6 iw6Var = (iw6) arrayList2.get(size - 1);
                this.X.add(iw6Var);
                return iw6Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lw6
    public final int v() {
        int iV;
        synchronized (this.a) {
            iV = this.f.v();
        }
        return iV;
    }

    @Override // defpackage.lw6
    public final int v0() {
        int iV0;
        synchronized (this.a) {
            iV0 = this.f.v0();
        }
        return iV0;
    }
}
