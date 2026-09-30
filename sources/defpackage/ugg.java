package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ugg implements cfg {
    public final /* synthetic */ int a;
    public final oid b;

    public /* synthetic */ ugg(oid oidVar, int i) {
        this.a = i;
        this.b = oidVar;
    }

    @Override // defpackage.cfg
    public final Object a() {
        int i = this.a;
        oid oidVar = this.b;
        switch (i) {
            case 0:
                return new tgg((Context) ((ysd) oidVar.b).b);
            default:
                Context context = (Context) ((ysd) oidVar.b).b;
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).metaData;
                    if (bundle != null) {
                        return bundle.getString("local_testing_dir");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return null;
        }
    }
}
