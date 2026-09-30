package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nx4 implements Serializable {
    private static final long serialVersionUID = 0;
    private final Class<Enum<Object>> c;

    public nx4(Enum[] enumArr) {
        enumArr.getClass();
        Class componentType = enumArr.getClass().getComponentType();
        componentType.getClass();
        this.c = componentType;
    }

    private final Object readResolve() {
        Enum<Object>[] enumConstants = this.c.getEnumConstants();
        enumConstants.getClass();
        return new mx4(enumConstants);
    }
}
