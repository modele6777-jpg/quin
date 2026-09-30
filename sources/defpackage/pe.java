package defpackage;

import androidx.media3.ui.AspectRatioFrameLayout;
import com.adjust.sdk.ActivityHandler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pe implements Runnable {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ Object c;

    public pe(c8h c8hVar, boolean z) {
        this.b = z;
        Objects.requireNonNull(c8hVar);
        this.c = c8hVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.a) {
            case 0:
                ((ActivityHandler) this.c).setAskingAttributionI(this.b);
                break;
            case 1:
                this.b = false;
                int i = AspectRatioFrameLayout.d;
                break;
            default:
                c8h c8hVar = (c8h) this.c;
                w3h w3hVar = (w3h) c8hVar.b;
                boolean zA = w3hVar.a();
                boolean z2 = w3hVar.N0 != null && w3hVar.N0.booleanValue();
                boolean z3 = this.b;
                w3hVar.N0 = Boolean.valueOf(z3);
                if (z2 == z3) {
                    w0h w0hVar = w3hVar.f;
                    w3h.h(w0hVar);
                    w0hVar.Z.b(Boolean.valueOf(z3), "Default data collection state already set to");
                }
                if (w3hVar.a() != zA) {
                    boolean zA2 = w3hVar.a();
                    if (w3hVar.N0 != null && w3hVar.N0.booleanValue()) {
                        z = true;
                    }
                    if (zA2 != z) {
                        w0h w0hVar2 = w3hVar.f;
                        w3h.h(w0hVar2);
                        w0hVar2.z.c(Boolean.valueOf(z3), Boolean.valueOf(zA), "Default data collection is different than actual status");
                    }
                } else {
                    w0h w0hVar3 = w3hVar.f;
                    w3h.h(w0hVar3);
                    w0hVar3.z.c(Boolean.valueOf(z3), Boolean.valueOf(zA), "Default data collection is different than actual status");
                }
                c8hVar.S0();
                break;
        }
    }

    public pe(boolean z, ActivityHandler activityHandler) {
        this.c = activityHandler;
        this.b = z;
    }

    public pe(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.c = aspectRatioFrameLayout;
    }
}
