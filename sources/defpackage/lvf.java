package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lvf {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static um2 b(View view, um2 um2Var) {
        ContentInfo contentInfoF = um2Var.a.f();
        Objects.requireNonNull(contentInfoF);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoF ? um2Var : new um2(new qm2(contentInfoPerformReceiveContent));
    }
}
