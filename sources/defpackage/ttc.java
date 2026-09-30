package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ttc {
    public static final qtc a = new qtc(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(qtc qtcVar) {
        qtcVar.getClass();
        if (qtcVar.f != null || qtcVar.g != null) {
            qc0.j("Failed requirement.");
            return;
        }
        if (qtcVar.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        qtc qtcVar2 = a;
        qtc qtcVar3 = (qtc) atomicReference.getAndSet(qtcVar2);
        if (qtcVar3 == qtcVar2) {
            return;
        }
        int i = qtcVar3 != null ? qtcVar3.c : 0;
        if (i >= 65536) {
            atomicReference.set(qtcVar3);
            return;
        }
        qtcVar.f = qtcVar3;
        qtcVar.b = 0;
        qtcVar.c = i + UserMetadata.MAX_INTERNAL_KEY_SIZE;
        atomicReference.set(qtcVar);
    }

    public static final qtc b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        qtc qtcVar = a;
        qtc qtcVar2 = (qtc) atomicReference.getAndSet(qtcVar);
        if (qtcVar2 == qtcVar) {
            return new qtc();
        }
        if (qtcVar2 == null) {
            atomicReference.set(null);
            return new qtc();
        }
        atomicReference.set(qtcVar2.f);
        qtcVar2.f = null;
        qtcVar2.c = 0;
        return qtcVar2;
    }
}
