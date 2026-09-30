package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z35 extends gbe implements l26 {
    final /* synthetic */ t7 $accountInfoProvider;
    final /* synthetic */ Context $context;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z35(t7 t7Var, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$accountInfoProvider = t7Var;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new z35(this.$accountInfoProvider, this.$context, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        m8b m8bVar;
        StringBuilder sb;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            hf8.Q.getClass();
            m8b m8bVarA = ef8.a("ExifTestScreen");
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(800, 600, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(Color.parseColor("#6751F6"));
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setTextSize(60.0f);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setAntiAlias(true);
            canvas.drawText("EXIF Test Image", 400.0f, 250.0f, paint);
            paint.setTextSize(40.0f);
            int i2 = Build.VERSION.SDK_INT;
            canvas.drawText(tec.e(i2, "Android "), 400.0f, 320.0f, paint);
            canvas.drawText(String.valueOf(System.currentTimeMillis()), 400.0f, 380.0f, paint);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strI = ks0.i(jCurrentTimeMillis, "test_conv_");
            String strA = ((mo3) this.$accountInfoProvider).a();
            if (strA.length() == 0) {
                strA = ks0.i(jCurrentTimeMillis, "test_uid_");
            }
            bi biVar = new bi(strI, strA);
            StringBuilder sbO = ub3.o("=== EXIF Write Test Started ===\n");
            sbO.append("Timestamp: " + jCurrentTimeMillis);
            sbO.append('\n');
            sbO.append("Android: " + i2 + " (" + Build.VERSION.RELEASE + ")");
            sbO.append('\n');
            sbO.append("Code Path: ".concat(i2 >= 29 ? "Modern (FileDescriptor)" : "Legacy"));
            sbO.append("\n\nEXIF Data to Write:\n");
            sbO.append("  conversationId: ".concat(strI));
            sbO.append('\n');
            sbO.append("  userUid: ".concat(strA));
            sbO.append("\n  modelInfo: DeepSeek Chat\n  deepseekFilingId: Beijing-DeepSeekChat-202404280016\n\n");
            m8bVarA.e("Starting EXIF test - Android " + i2);
            Context context = this.$context;
            String strI2 = ks0.i(jCurrentTimeMillis, "exif_test_");
            this.L$0 = m8bVarA;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = sbO;
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            js3 js3Var = ga4.a;
            Object objP0 = ynb.p0(hr3.c, new oz0(context, bitmapCreateBitmap, strI2, biVar, "QuinTest", null), this);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
                return bw2Var;
            }
            obj = objP0;
            m8bVar = m8bVarA;
            sb = sbO;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sb = (StringBuilder) this.L$5;
            m8bVar = (m8b) this.L$0;
            jzb.q(obj);
        }
        Uri uri = (Uri) obj;
        if (uri != null) {
            sb.append("✅ Image saved successfully\n");
            sb.append("URI: " + uri);
            sb.append('\n');
            sb.append("  Scheme: " + uri.getScheme());
            sb.append('\n');
            sb.append("  Path: " + uri.getPath());
            sb.append("\n\nNext: Click 'Verify EXIF Data' to read it back\n");
            m8bVar.e("Image saved successfully: " + uri);
        } else {
            sb.append("❌ Failed to save image\n");
            m8bVar.b("Failed to save image with EXIF");
        }
        return new gme(uri, sb.toString());
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((z35) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
