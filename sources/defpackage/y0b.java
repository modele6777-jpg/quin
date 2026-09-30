package defpackage;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0b implements mk9 {
    public static final Charset e = Charset.forName(Constants.ENCODING);
    public static final rc5 f = new rc5("key", kv2.t(kv2.r(t0b.class, new qh0(1))));
    public static final rc5 g = new rc5("value", kv2.t(kv2.r(t0b.class, new qh0(2))));
    public static final eh7 h = new eh7(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final z0b d = new z0b(this);

    public y0b(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
    }

    public static int k(rc5 rc5Var) {
        t0b t0bVar = (t0b) ((Annotation) rc5Var.b.get(t0b.class));
        if (t0bVar != null) {
            return t0bVar.tag();
        }
        throw new kv4("Field has no @Protobuf config");
    }

    @Override // defpackage.mk9
    public final mk9 a(rc5 rc5Var, Object obj) {
        i(rc5Var, obj, true);
        return this;
    }

    public final void b(rc5 rc5Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        l((k(rc5Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(rc5 rc5Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        t0b t0bVar = (t0b) ((Annotation) rc5Var.b.get(t0b.class));
        if (t0bVar == null) {
            throw new kv4("Field has no @Protobuf config");
        }
        int iOrdinal = t0bVar.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(t0bVar.tag() << 3);
            l(i);
        } else if (iOrdinal == 1) {
            l(t0bVar.tag() << 3);
            l((i << 1) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((t0bVar.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    @Override // defpackage.mk9
    public final mk9 d(rc5 rc5Var, boolean z) {
        c(rc5Var, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.mk9
    public final mk9 e(rc5 rc5Var, int i) {
        c(rc5Var, i, true);
        return this;
    }

    @Override // defpackage.mk9
    public final mk9 f(rc5 rc5Var, double d) throws IOException {
        b(rc5Var, d, true);
        return this;
    }

    @Override // defpackage.mk9
    public final mk9 g(rc5 rc5Var, long j) throws IOException {
        h(rc5Var, j, true);
        return this;
    }

    public final void h(rc5 rc5Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        t0b t0bVar = (t0b) ((Annotation) rc5Var.b.get(t0b.class));
        if (t0bVar == null) {
            throw new kv4("Field has no @Protobuf config");
        }
        int iOrdinal = t0bVar.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(t0bVar.tag() << 3);
            m(j);
        } else if (iOrdinal == 1) {
            l(t0bVar.tag() << 3);
            m((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((t0bVar.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void i(rc5 rc5Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            l((k(rc5Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(e);
            l(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(rc5Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(h, rc5Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(rc5Var, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            l((k(rc5Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(rc5Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            c(rc5Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            l((k(rc5Var) << 3) | 2);
            l(bArr.length);
            this.a.write(bArr);
            return;
        }
        lk9 lk9Var = (lk9) this.b.get(obj.getClass());
        if (lk9Var != null) {
            j(lk9Var, rc5Var, obj, z);
            return;
        }
        qrf qrfVar = (qrf) this.c.get(obj.getClass());
        if (qrfVar != null) {
            z0b z0bVar = this.d;
            z0bVar.a = false;
            z0bVar.c = rc5Var;
            z0bVar.b = z;
            qrfVar.encode(obj, z0bVar);
            return;
        }
        if (obj instanceof p0b) {
            c(rc5Var, ((p0b) obj).a(), true);
        } else if (obj instanceof Enum) {
            c(rc5Var, ((Enum) obj).ordinal(), true);
        } else {
            j(jgb.o, rc5Var, obj, z);
        }
    }

    public final void j(lk9 lk9Var, rc5 rc5Var, Object obj, boolean z) throws IOException {
        w38 w38Var = new w38();
        w38Var.a = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = w38Var;
            try {
                lk9Var.encode(obj, this);
                this.a = outputStream;
                long j = w38Var.a;
                w38Var.close();
                if (z && j == 0) {
                    return;
                }
                l((k(rc5Var) << 3) | 2);
                m(j);
                lk9Var.encode(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                w38Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                i >>>= 7;
            }
        }
    }

    public final void m(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                j >>>= 7;
            }
        }
    }
}
