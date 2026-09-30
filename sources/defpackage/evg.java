package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class evg extends m7c {
    @Override // defpackage.m7c
    public final boolean A(zwg zwgVar, bvg bvgVar, bvg bvgVar2) {
        synchronized (zwgVar) {
            try {
                if (zwgVar.b != bvgVar) {
                    return false;
                }
                zwgVar.b = bvgVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m7c
    public final boolean B(ivg ivgVar, Object obj, Object obj2) {
        synchronized (ivgVar) {
            try {
                if (ivgVar.a != obj) {
                    return false;
                }
                ivgVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m7c
    public final boolean C(ivg ivgVar, gvg gvgVar, gvg gvgVar2) {
        synchronized (ivgVar) {
            try {
                if (ivgVar.c != gvgVar) {
                    return false;
                }
                ivgVar.c = gvgVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m7c
    public final bvg w(zwg zwgVar) {
        bvg bvgVar;
        bvg bvgVar2 = bvg.d;
        synchronized (zwgVar) {
            try {
                bvgVar = zwgVar.b;
                if (bvgVar != bvgVar2) {
                    zwgVar.b = bvgVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bvgVar;
    }

    @Override // defpackage.m7c
    public final gvg x(zwg zwgVar) {
        gvg gvgVar;
        gvg gvgVar2 = gvg.c;
        synchronized (zwgVar) {
            try {
                gvgVar = zwgVar.c;
                if (gvgVar != gvgVar2) {
                    zwgVar.c = gvgVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gvgVar;
    }

    @Override // defpackage.m7c
    public final void y(gvg gvgVar, gvg gvgVar2) {
        gvgVar.b = gvgVar2;
    }

    @Override // defpackage.m7c
    public final void z(gvg gvgVar, Thread thread) {
        gvgVar.a = thread;
    }
}
