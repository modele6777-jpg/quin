package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jt2 implements qa4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jt2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qa4
    public final void a() {
        switch (this.a) {
            case 0:
                AtomicReference atomicReference = k3b.a;
                Object obj = this.b;
                AtomicReference atomicReference2 = k3b.a;
                j3b j3bVar = (j3b) atomicReference2.get();
                if (j3bVar != null) {
                    if (j3bVar.a != obj) {
                        j3bVar = null;
                    }
                    if (j3bVar != null) {
                        while (!atomicReference2.compareAndSet(j3bVar, null) && atomicReference2.get() == j3bVar) {
                        }
                    }
                }
                break;
            case 1:
                AtomicReference atomicReference3 = t3b.a;
                Object obj2 = this.b;
                AtomicReference atomicReference4 = t3b.a;
                s3b s3bVar = (s3b) atomicReference4.get();
                if (s3bVar != null) {
                    if (s3bVar.a != obj2) {
                        s3bVar = null;
                    }
                    if (s3bVar != null) {
                        while (!atomicReference4.compareAndSet(s3bVar, null) && atomicReference4.get() == s3bVar) {
                        }
                    }
                }
                break;
            case 2:
                if (od4.Z == this.b) {
                    od4.Z = null;
                    od4.a0 = null;
                }
                break;
            case 3:
                AtomicReference atomicReference5 = m3b.a;
                Object obj3 = this.b;
                obj3.getClass();
                AtomicReference atomicReference6 = m3b.a;
                l3b l3bVar = (l3b) atomicReference6.get();
                if (l3bVar != null) {
                    if (l3bVar.a != obj3) {
                        l3bVar = null;
                    }
                    if (l3bVar != null) {
                        while (!atomicReference6.compareAndSet(l3bVar, null) && atomicReference6.get() == l3bVar) {
                        }
                    }
                }
                break;
            default:
                AtomicReference atomicReference7 = i3b.a;
                Object obj4 = this.b;
                AtomicReference atomicReference8 = i3b.a;
                h3b h3bVar = (h3b) atomicReference8.get();
                if ((h3bVar != null ? h3bVar.a : null) == obj4) {
                    while (!atomicReference8.compareAndSet(h3bVar, null) && atomicReference8.get() == h3bVar) {
                    }
                }
                break;
        }
    }
}
