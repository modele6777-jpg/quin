package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sm2 implements rm2, tm2 {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public sm2(sm2 sm2Var) {
        ClipData clipData = sm2Var.b;
        clipData.getClass();
        this.b = clipData;
        int i = sm2Var.c;
        ok8.m("source", i, 0, 5);
        this.c = i;
        int i2 = sm2Var.d;
        if ((i2 & 1) != i2) {
            yg5.o("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.d = i2;
        this.e = sm2Var.e;
        this.f = sm2Var.f;
    }

    @Override // defpackage.rm2
    public void a(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.tm2
    public int b() {
        return this.d;
    }

    @Override // defpackage.rm2
    public um2 build() {
        return new um2(new sm2(this));
    }

    @Override // defpackage.tm2
    public ClipData c() {
        return this.b;
    }

    @Override // defpackage.rm2
    public void d(int i) {
        this.d = i;
    }

    @Override // defpackage.tm2
    public int e() {
        return this.c;
    }

    @Override // defpackage.tm2
    public ContentInfo f() {
        return null;
    }

    @Override // defpackage.rm2
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return ks0.l(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ sm2() {
    }
}
