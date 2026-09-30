package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cz implements nm3 {
    public final ax6 a;
    public final as9 b;
    public final boolean c;

    public cz(ax6 ax6Var, as9 as9Var, boolean z) {
        this.a = ax6Var;
        this.b = as9Var;
        this.c = z;
    }

    public static final Drawable b(cz czVar, imb imbVar) {
        ax6 ax6VarR = kn2.R(czVar.a, czVar.c);
        try {
            ImageDecoder.Source sourceW = bp.W(ax6VarR, czVar.b, true);
            if (sourceW == null) {
                v41 v41VarP0 = ax6VarR.P0();
                try {
                    v41VarP0.request(Long.MAX_VALUE);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) v41VarP0.i().b);
                    while (!v41VarP0.i().E()) {
                        v41VarP0.i().read(byteBufferAllocateDirect);
                    }
                    byteBufferAllocateDirect.flip();
                    v41VarP0.close();
                    sourceW = ImageDecoder.createSource(byteBufferAllocateDirect);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ym8.t(v41VarP0, th);
                        throw th2;
                    }
                }
            }
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(sourceW, new zy(czVar, imbVar, 0));
            cgg.t(ax6VarR, null);
            return drawableDecodeDrawable;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                cgg.t(ax6VarR, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.nm3
    public final Object a(xn2 xn2Var) {
        yy yyVar;
        imb imbVar;
        Object objX;
        imb imbVar2;
        if (xn2Var instanceof yy) {
            yyVar = (yy) xn2Var;
            int i = yyVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                yyVar.label = i - Integer.MIN_VALUE;
            } else {
                yyVar = new yy(this, (zn2) xn2Var);
            }
        } else {
            yyVar = new yy(this, (zn2) xn2Var);
        }
        Object obj = yyVar.result;
        int i2 = yyVar.label;
        Object obj2 = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            imbVar = new imb();
            v6 v6Var = new v6(8, this, imbVar);
            yyVar.L$0 = imbVar;
            yyVar.label = 1;
            objX = nk8.x(v6Var, yyVar);
            if (objX != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            imb imbVar3 = (imb) yyVar.L$0;
            jzb.q(obj);
            objX = obj;
            imbVar = imbVar3;
        } else {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imbVar2 = (imb) yyVar.L$0;
            jzb.q(obj);
        }
        return new jm3(y7h.k((Drawable) obj), imbVar2.element);
        yyVar.L$0 = imbVar;
        yyVar.L$1 = null;
        yyVar.label = 2;
        Object objC = c((Drawable) objX, yyVar);
        if (objC != obj2) {
            imb imbVar4 = imbVar;
            obj = objC;
            imbVar2 = imbVar4;
            return new jm3(y7h.k((Drawable) obj), imbVar2.element);
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Drawable drawable, zn2 zn2Var) {
        az azVar;
        if (zn2Var instanceof az) {
            azVar = (az) zn2Var;
            int i = azVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                azVar.label = i - Integer.MIN_VALUE;
            } else {
                azVar = new az(this, zn2Var);
            }
        } else {
            azVar = new az(this, zn2Var);
        }
        Object obj = azVar.result;
        int i2 = azVar.label;
        as9 as9Var = this.b;
        if (i2 == 0) {
            jzb.q(obj);
            if (!(drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            q95 q95Var = tw6.a;
            if (((Number) b21.A(as9Var, q95Var)).intValue() != -2) {
                ((AnimatedImageDrawable) drawable).setRepeatCount(((Number) b21.A(as9Var, q95Var)).intValue());
            }
            x16 x16Var = (x16) b21.A(as9Var, tw6.c);
            x16 x16Var2 = (x16) b21.A(as9Var, tw6.d);
            if (x16Var != null || x16Var2 != null) {
                js3 js3Var = ga4.a;
                wg6 wg6Var = mk8.a.f;
                bz bzVar = new bz(drawable, x16Var, x16Var2, null);
                azVar.L$0 = drawable;
                azVar.L$1 = null;
                azVar.L$2 = null;
                azVar.label = 1;
                Object objP0 = ynb.p0(wg6Var, bzVar, azVar);
                bw2 bw2Var = bw2.a;
                if (objP0 == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            drawable = (Drawable) azVar.L$0;
            jzb.q(obj);
        }
        return new bec(drawable, as9Var.c);
    }
}
