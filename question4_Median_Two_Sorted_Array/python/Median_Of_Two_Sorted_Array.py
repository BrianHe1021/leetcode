def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        a = nums1 + nums2
        a = sorted(a)
        mid = len(a) // 2
        med = (a[mid] + a[~mid]) / 2
        return med