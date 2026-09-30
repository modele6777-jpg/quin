package defpackage;

import android.os.Build;
import com.adjust.sdk.Constants;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sd1 {
    public static final Map c = bm8.G(new iy9("Google", qd0.I0(new String[]{"oriole", "raven", "bluejay", "panther", "cheetah", "lynx"})));
    public static final Map d = bm8.H(new iy9(Constants.REFERRER_API_GOOGLE, qd0.I0(new String[]{"pixel 4", "pixel 4 xl"})), new iy9(Constants.REFERRER_API_SAMSUNG, n3d.p("sm-g770f")));
    public final rd1 a;
    public final i4e b;

    public sd1(rd1 rd1Var, i4e i4eVar) {
        rd1Var.getClass();
        i4eVar.getClass();
        this.a = rd1Var;
        this.b = i4eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public final boolean a(String str) {
        boolean z;
        str.getClass();
        this.b.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            xg1 xg1Var = yg1.o;
            yg1 yg1VarA = ((qd1) this.a).a(str);
            xg1Var.getClass();
            if (xg1.c(yg1VarA)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z || ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && str.equals("1"));
    }
}
