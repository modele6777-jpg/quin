package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wqf {
    public static final Pattern a = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static wqf b;

    public wqf(w1e w1eVar) {
    }

    public final boolean a(vp0 vp0Var) {
        return TextUtils.isEmpty(vp0Var.c) || vp0Var.f + vp0Var.e < (System.currentTimeMillis() / 1000) + 3600;
    }
}
