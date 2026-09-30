package defpackage;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b45 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ Uri $uri;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b45(Uri uri, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$uri = uri;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        b45 b45Var = new b45(this.$uri, this.$context, xn2Var);
        b45Var.L$0 = obj;
        return b45Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        hf8.Q.getClass();
        m8b m8bVarA = ef8.a("ExifTestScreen");
        StringBuilder sb = new StringBuilder("=== EXIF Verification ===\n");
        sb.append("URI: " + this.$uri);
        sb.append('\n');
        int i = Build.VERSION.SDK_INT;
        sb.append("Android: " + i);
        sb.append("\n\n");
        String str = "  ❌ NOT FOUND";
        try {
            if (i >= 29) {
                sb.append("Method: FileDescriptor (Android Q+)");
                sb.append('\n');
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.$context.getContentResolver().openFileDescriptor(this.$uri, "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        String attribute = new ExifInterface(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).getAttribute("UserComment");
                        sb.append('\n');
                        sb.append("UserComment tag:");
                        sb.append('\n');
                        if (attribute != null) {
                            str = attribute;
                        }
                        sb.append(str);
                        sb.append('\n');
                        if (attribute != null) {
                            sb.append('\n');
                            sb.append("✅ SUCCESS: EXIF data found!");
                            sb.append('\n');
                            m8bVarA.e("EXIF verification SUCCESS");
                        } else {
                            sb.append('\n');
                            sb.append("❌ FAILURE: EXIF data NOT found");
                            sb.append('\n');
                            m8bVarA.b("EXIF verification FAILED - no data found");
                        }
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ym8.t(parcelFileDescriptorOpenFileDescriptor, th);
                            throw th2;
                        }
                    }
                } else {
                    Uri uri = this.$uri;
                    sb.append("❌ Could not open FileDescriptor");
                    sb.append('\n');
                    m8bVarA.b("Could not open FileDescriptor for URI: " + uri);
                }
            } else {
                sb.append("Method: InputStream (Android <Q)");
                sb.append('\n');
                InputStream inputStreamOpenInputStream = this.$context.getContentResolver().openInputStream(this.$uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        String attribute2 = new ExifInterface(inputStreamOpenInputStream).getAttribute("UserComment");
                        sb.append('\n');
                        sb.append("UserComment tag:");
                        sb.append('\n');
                        if (attribute2 != null) {
                            str = attribute2;
                        }
                        sb.append(str);
                        sb.append('\n');
                        if (attribute2 != null) {
                            sb.append('\n');
                            sb.append("✅ SUCCESS: EXIF data found!");
                            sb.append('\n');
                            m8bVarA.e("EXIF verification SUCCESS (legacy)");
                        } else {
                            sb.append('\n');
                            sb.append("❌ FAILURE: EXIF data NOT found");
                            sb.append('\n');
                            sb.append('\n');
                            sb.append("This is EXPECTED to fail with current code on Android <Q");
                            sb.append('\n');
                            sb.append("The legacy write path is broken - needs fix!");
                            sb.append('\n');
                            m8bVarA.b("EXIF verification FAILED - legacy path issue");
                        }
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            ym8.t(inputStreamOpenInputStream, th3);
                            throw th4;
                        }
                    }
                } else {
                    Uri uri2 = this.$uri;
                    sb.append("❌ Could not open InputStream");
                    sb.append('\n');
                    m8bVarA.b("Could not open InputStream for URI: " + uri2);
                }
            }
        } catch (Exception e) {
            sb.append("\n❌ Exception during verification:\n");
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            sb.append(message);
            sb.append("\n\nStack trace:\n");
            sb.append(bzd.I(e));
            sb.append('\n');
            m8bVarA.c("EXIF verification exception", e);
        }
        return sb.toString();
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b45) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
