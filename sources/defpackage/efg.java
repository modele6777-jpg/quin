package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.assetpacks.a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class efg implements cfg {
    public final /* synthetic */ int a;
    public final oid b;
    public final bfg c;
    public final bfg d;

    public /* synthetic */ efg(oid oidVar, bfg bfgVar, bfg bfgVar2, int i) {
        this.a = i;
        this.b = oidVar;
        this.c = bfgVar;
        this.d = bfgVar2;
    }

    @Override // defpackage.cfg
    public final Object a() {
        String string;
        int i = this.a;
        bfg bfgVar = this.d;
        bfg bfgVar2 = this.c;
        oid oidVar = this.b;
        switch (i) {
            case 0:
                return new a((Context) ((ysd) oidVar.b).b, (egg) bfgVar2.a(), (vgg) bfgVar.a());
            default:
                Context context = (Context) ((ysd) oidVar.b).b;
                bfg bfgVar3 = new bfg(new fnb(bfgVar2));
                bfg bfgVar4 = new bfg(new fnb(bfgVar));
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).metaData;
                    string = bundle == null ? null : bundle.getString("local_testing_dir");
                } catch (PackageManager.NameNotFoundException unused) {
                }
                lhg lhgVar = string == null ? (lhg) bfgVar3.a() : (lhg) bfgVar4.a();
                afc.c(lhgVar);
                return lhgVar;
        }
    }
}
