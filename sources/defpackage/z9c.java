package defpackage;

import com.adjust.sdk.Constants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z9c implements Cloneable {
    public kxa E0;
    public String F0;
    public String G0;
    public String H0;
    public Boolean I0;
    public Boolean J0;
    public iac K0;
    public Float L0;
    public String M0;
    public String N0;
    public iac O0;
    public Float P0;
    public iac Q0;
    public Float R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public l9c X;
    public int X0;
    public Integer Y;
    public int Y0;
    public Boolean Z;
    public int Z0;
    public long a = 0;
    public int a1;
    public iac b;
    public int b1;
    public Float c;
    public iac d;
    public Float e;
    public l9c f;
    public Float g;
    public l9c[] v;
    public l9c w;
    public Float x;
    public c9c y;
    public ArrayList z;

    public static z9c a() {
        z9c z9cVar = new z9c();
        z9cVar.a = -1L;
        c9c c9cVar = c9c.b;
        z9cVar.b = c9cVar;
        z9cVar.S0 = 1;
        Float fValueOf = Float.valueOf(1.0f);
        z9cVar.c = fValueOf;
        z9cVar.d = null;
        z9cVar.e = fValueOf;
        z9cVar.f = new l9c(1.0f);
        z9cVar.T0 = 1;
        z9cVar.U0 = 1;
        z9cVar.g = Float.valueOf(4.0f);
        z9cVar.v = null;
        z9cVar.w = new l9c(0.0f);
        z9cVar.x = fValueOf;
        z9cVar.y = c9cVar;
        z9cVar.z = null;
        z9cVar.X = new l9c(7, 12.0f);
        z9cVar.Y = Integer.valueOf(Constants.MINIMAL_ERROR_STATUS_CODE);
        z9cVar.V0 = 1;
        z9cVar.W0 = 1;
        z9cVar.X0 = 1;
        z9cVar.Y0 = 1;
        Boolean bool = Boolean.TRUE;
        z9cVar.Z = bool;
        z9cVar.E0 = null;
        z9cVar.F0 = null;
        z9cVar.G0 = null;
        z9cVar.H0 = null;
        z9cVar.I0 = bool;
        z9cVar.J0 = bool;
        z9cVar.K0 = c9cVar;
        z9cVar.L0 = fValueOf;
        z9cVar.M0 = null;
        z9cVar.Z0 = 1;
        z9cVar.N0 = null;
        z9cVar.O0 = null;
        z9cVar.P0 = fValueOf;
        z9cVar.Q0 = null;
        z9cVar.R0 = fValueOf;
        z9cVar.a1 = 1;
        z9cVar.b1 = 1;
        return z9cVar;
    }

    public final Object clone() {
        z9c z9cVar = (z9c) super.clone();
        l9c[] l9cVarArr = this.v;
        if (l9cVarArr != null) {
            z9cVar.v = (l9c[]) l9cVarArr.clone();
        }
        return z9cVar;
    }
}
