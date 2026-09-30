package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o7h extends d8c {
    @Override // defpackage.d8c
    public final void u(y8h y8hVar, y8h y8hVar2) {
        y8hVar.b = y8hVar2;
    }

    @Override // defpackage.d8c
    public final void v(y8h y8hVar, Thread thread) {
        y8hVar.a = thread;
    }

    @Override // defpackage.d8c
    public final boolean w(bbh bbhVar, j1h j1hVar, j1h j1hVar2) {
        synchronized (bbhVar) {
            try {
                if (bbhVar.b != j1hVar) {
                    return false;
                }
                bbhVar.b = j1hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.d8c
    public final boolean x(bbh bbhVar, Object obj, Object obj2) {
        synchronized (bbhVar) {
            try {
                if (bbhVar.a != obj) {
                    return false;
                }
                bbhVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.d8c
    public final boolean y(bbh bbhVar, y8h y8hVar, y8h y8hVar2) {
        synchronized (bbhVar) {
            try {
                if (bbhVar.c != y8hVar) {
                    return false;
                }
                bbhVar.c = y8hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
