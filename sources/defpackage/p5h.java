package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p5h extends l0h {
    private static final p5h zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private d6h zzh;
    private int zzi;

    static {
        p5h p5hVar = new p5h();
        zzb = p5hVar;
        l0h.f(p5h.class, p5hVar);
    }

    public static /* synthetic */ void p(p5h p5hVar, c7h c7hVar) {
        p5hVar.zzf = c7hVar;
        p5hVar.zze = 7;
    }

    public static /* synthetic */ void q(p5h p5hVar, l8h l8hVar) {
        p5hVar.zzf = l8hVar;
        p5hVar.zze = 6;
    }

    public static /* synthetic */ void r(p5h p5hVar, int i) {
        p5hVar.zzg = i - 1;
        p5hVar.zzd |= 1;
    }

    public static l5h s() {
        return (l5h) zzb.k();
    }

    public static p5h t(byte[] bArr) throws p1h {
        l0h l0hVar = zzb;
        int length = bArr.length;
        kzg kzgVar = kzg.a;
        int i = hyg.a;
        kzg kzgVar2 = kzg.a;
        if (length != 0) {
            l0h l0hVarN = l0hVar.n();
            try {
                s3h s3hVarA = i3h.b.a(l0hVarN.getClass());
                tlg tlgVar = new tlg();
                kzgVar2.getClass();
                s3hVarA.e(l0hVarN, bArr, 0, length, tlgVar);
                s3hVarA.b(l0hVarN);
                l0hVar = l0hVarN;
            } catch (IOException e) {
                if (e.getCause() instanceof p1h) {
                    throw ((p1h) e.getCause());
                }
                throw new p1h(e.getMessage(), e);
            } catch (IndexOutOfBoundsException unused) {
                s8f.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (k4h e2) {
                s8f.o(e2.getMessage());
                return null;
            } catch (p1h e3) {
                throw e3;
            }
        }
        if (l0hVar == null || l0h.i(l0hVar, true)) {
            return (p5h) l0hVar;
        }
        s8f.o(new k4h().getMessage());
        return null;
    }

    public static /* synthetic */ void v(p5h p5hVar, j6h j6hVar) {
        p5hVar.zzi = j6hVar.a();
        p5hVar.zzd |= 4;
    }

    public static /* synthetic */ void w(p5h p5hVar, d6h d6hVar) {
        p5hVar.zzh = d6hVar;
        p5hVar.zzd |= 2;
    }

    @Override // defpackage.l0h
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new q3h(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", uxg.c, "zzh", x6h.class, "zzi", uxg.e, l8h.class, c7h.class});
        }
        if (i2 == 3) {
            return new p5h();
        }
        if (i2 == 4) {
            return new l5h(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final c7h u() {
        return this.zze == 7 ? (c7h) this.zzf : c7h.p();
    }
}
