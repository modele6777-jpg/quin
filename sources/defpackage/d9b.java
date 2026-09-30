package defpackage;

import android.content.Intent;
import android.webkit.WebChromeClient;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d9b extends h36 implements l26 {
    public static final d9b a = new d9b(2, WebChromeClient.FileChooserParams.class, "parseResult", "parseResult(ILandroid/content/Intent;)[Landroid/net/Uri;", 0);

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return WebChromeClient.FileChooserParams.parseResult(((Number) obj).intValue(), (Intent) obj2);
    }
}
