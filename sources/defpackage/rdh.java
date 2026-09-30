package defpackage;

import android.os.StrictMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rdh {
    public static final qdh a;

    static {
        qdh qdhVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                Iterator it = Arrays.asList(new qdh[0]).iterator();
                if (it.hasNext()) {
                    qdhVar = (qdh) it.next();
                    pa7.I("Expected at most one FlagsService", !it.hasNext());
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                } else {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    qdhVar = new qdh();
                }
                a = qdhVar;
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }
}
