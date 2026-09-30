package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u0g extends z60 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0g(String str, String str2, int i) {
        super(str, str2, 2);
        this.e = i;
    }

    @Override // defpackage.a70
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b()) {
                    return false;
                }
                WeakHashMap weakHashMap = s0g.a;
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage == null) {
                    return false;
                }
                return (Build.VERSION.SDK_INT >= 28 ? s.v(currentWebViewPackage) : (long) currentWebViewPackage.versionCode) >= 636700000;
            case 1:
                if (!super.b() || !v0g.a("MULTI_PROCESS")) {
                    return false;
                }
                WeakHashMap weakHashMap2 = s0g.a;
                if (v0g.a.b()) {
                    return w0g.a.getStatics().isMultiProcessEnabled();
                }
                s8f.i("This method is not supported by the current version of the framework and the current WebView APK");
                return false;
            default:
                if (v0g.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
