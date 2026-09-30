package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x8h {
    public static final kb6 a;

    static {
        Object qkgVar;
        ((ikg) dkg.a).getClass();
        AtomicReference atomicReference = mkg.g;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            okg okgVar = (okg) atomicReference.get();
            qkgVar = new qkg("Phlogger", okgVar.a, okgVar.b, okgVar.c);
        } else {
            for (int i = 7; i >= 0; i--) {
                char cCharAt = "Phlogger".charAt(i);
                if (cCharAt == '$') {
                    strReplace = "Phlogger".replace('$', '.');
                    break;
                } else {
                    if (cCharAt == '.') {
                        break;
                    }
                }
            }
            mkg mkgVar = new mkg(7, strReplace);
            if (mkg.d || mkg.e) {
                mkgVar.c = new pkg(strReplace);
            } else if (mkg.f) {
                okg okgVar2 = qkg.w;
                mkgVar.c = new qkg(strReplace, Level.OFF, okgVar2.b, okgVar2.c);
            } else {
                mkgVar.c = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = kkg.a;
            concurrentLinkedQueue.offer(mkgVar);
            qkgVar = mkgVar;
            if (atomicReference.get() != null) {
                while (true) {
                    mkg mkgVar2 = (mkg) concurrentLinkedQueue.poll();
                    if (mkgVar2 == null) {
                        break;
                    }
                    okg okgVar3 = (okg) atomicReference.get();
                    mkgVar2.c = new qkg((String) mkgVar2.b, okgVar3.a, okgVar3.b, okgVar3.c);
                }
                mkg.B0();
                qkgVar = mkgVar;
            }
        }
        a = new kb6(2, qkgVar);
    }
}
