package com.google.android.filament.gltfio;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface MaterialProvider {

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static class MaterialKey {
        public int alphaMode;
        public int aoUV;
        public int baseColorUV;
        public int clearCoatNormalUV;
        public int clearCoatRoughnessUV;
        public int clearCoatUV;
        public boolean doubleSided;
        public int emissiveUV;
        public boolean enableDiagnostics;
        public boolean hasBaseColorTexture;
        public boolean hasClearCoat;
        public boolean hasClearCoatNormalTexture;
        public boolean hasClearCoatRoughnessTexture;
        public boolean hasClearCoatTexture;
        public boolean hasEmissiveTexture;
        public boolean hasIOR;
        public boolean hasMetallicRoughnessTexture;
        public boolean hasNormalTexture;
        public boolean hasOcclusionTexture;
        public boolean hasSheen;
        public boolean hasSheenColorTexture;
        public boolean hasSheenRoughnessTexture;
        public boolean hasTextureTransforms;
        public boolean hasTransmission;
        public boolean hasTransmissionTexture;
        public boolean hasVertexColors;
        public boolean hasVolumeThicknessTexture;
        public int metallicRoughnessUV;
        public int normalUV;
        public int sheenColorUV;
        public int sheenRoughnessUV;
        public int transmissionUV;
        public boolean unlit;
        public boolean useSpecularGlossiness;
        public int volumeThicknessUV;

        static {
            nGlobalInit();
        }

        private static native void nGlobalInit();
    }
}
