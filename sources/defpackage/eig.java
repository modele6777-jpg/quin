package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.b1;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eig extends mig {
    public final kjg b;

    public eig(kjg kjgVar) {
        super(1);
        this.b = kjgVar;
    }

    @Override // defpackage.mig
    public final void a(Status status) {
        try {
            this.b.g(status);
        } catch (IllegalStateException e) {
            b1.n("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.mig
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.b.g(new Status(10, ib8.m(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException e) {
            b1.n("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.mig
    public final void c(vea veaVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) veaVar.b;
        kjg kjgVar = this.b;
        map.put(kjgVar, boolValueOf);
        kjgVar.a(new tig(veaVar, kjgVar));
    }

    @Override // defpackage.mig
    public final void d(rhg rhgVar) throws DeadObjectException {
        try {
            kjg kjgVar = this.b;
            try {
                try {
                    kjgVar.f(rhgVar.e);
                } catch (RemoteException e) {
                    kjgVar.g(new Status(8, e.getLocalizedMessage(), null, null));
                }
            } catch (DeadObjectException e2) {
                kjgVar.g(new Status(8, e2.getLocalizedMessage(), null, null));
                throw e2;
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }
}
