package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class myc implements Externalizable {
    private static final long serialVersionUID = 0;
    private int typeTag;
    private Object value;

    public myc(int i, Serializable serializable) {
        this.typeTag = i;
        this.value = serializable;
    }

    private final Object readResolve() {
        Object obj = this.value;
        obj.getClass();
        return obj;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object ma8Var;
        objectInput.getClass();
        byte b = objectInput.readByte();
        this.typeTag = b;
        if (b == 2) {
            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(objectInput.readLong());
            localDateOfEpochDay.getClass();
            ma8Var = new ma8(localDateOfEpochDay);
        } else if (b == 3) {
            jd8 jd8Var = kd8.Companion;
            long j = objectInput.readLong();
            jd8Var.getClass();
            try {
                ma8Var = new kd8(LocalTime.ofNanoOfDay(j));
            } catch (DateTimeException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (b == 4) {
            LocalDate localDateOfEpochDay2 = LocalDate.ofEpochDay(objectInput.readLong());
            localDateOfEpochDay2.getClass();
            ma8 ma8Var2 = new ma8(localDateOfEpochDay2);
            jd8 jd8Var2 = kd8.Companion;
            long j2 = objectInput.readLong();
            jd8Var2.getClass();
            try {
                ma8Var = new va8(ma8Var2, new kd8(LocalTime.ofNanoOfDay(j2)));
            } catch (DateTimeException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (b == 10) {
            ma8Var = dqf.a(null, null, Integer.valueOf(objectInput.readInt()));
        } else {
            if (b != 11) {
                throw new IOException("Unknown type tag: " + this.typeTag);
            }
            adg adgVar = bdg.Companion;
            long j3 = objectInput.readLong();
            ace aceVar = jdg.a;
            adgVar.getClass();
            long j4 = j3 / 12;
            if ((j3 ^ 12) < 0 && j4 * 12 != j3) {
                j4--;
            }
            long j5 = j3 % 12;
            ma8Var = new bdg((int) (j4 + 1970), ((int) (j5 + (12 & (((j5 ^ 12) & ((-j5) | j5)) >> 63)))) + 1);
        }
        this.value = ma8Var;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.typeTag);
        Object obj = this.value;
        int i = this.typeTag;
        if (i == 2) {
            obj.getClass();
            objectOutput.writeLong(((ma8) obj).i().toEpochDay());
            return;
        }
        if (i == 3) {
            obj.getClass();
            objectOutput.writeLong(((kd8) obj).b());
            return;
        }
        if (i == 4) {
            obj.getClass();
            va8 va8Var = (va8) obj;
            objectOutput.writeLong(va8Var.a().i().toEpochDay());
            objectOutput.writeLong(va8Var.b().b());
            return;
        }
        if (i == 10) {
            obj.getClass();
            objectOutput.writeInt(((xpf) obj).a());
        } else {
            if (i != 11) {
                cva.m("Unknown type tag: ", this.typeTag, " for value: ", obj);
                return;
            }
            obj.getClass();
            bdg bdgVar = (bdg) obj;
            ace aceVar = jdg.a;
            objectOutput.writeLong((((((long) bdgVar.b()) - 1970) * 12) + ((long) bdgVar.a())) - 1);
        }
    }
}
