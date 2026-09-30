package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qw {
    public final /* synthetic */ int a;

    public /* synthetic */ qw(int i) {
        this.a = i;
    }

    public final qhf a(Object obj, as9 as9Var) {
        switch (this.a) {
            case 0:
                return afc.s(((Uri) obj).toString());
            case 1:
                return afc.b(((File) obj).getPath());
            case 2:
                return afc.b(((e1a) obj).a.t());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = as9Var.a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return afc.s("android.resource://" + context.getPackageName() + "/" + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return afc.s((String) obj);
        }
    }
}
