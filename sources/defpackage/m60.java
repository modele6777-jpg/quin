package defpackage;

import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m60 {
    public static /* synthetic */ SessionConfiguration a(int i, ArrayList arrayList, Executor executor, op opVar) {
        return new SessionConfiguration(i, arrayList, executor, opVar);
    }
}
