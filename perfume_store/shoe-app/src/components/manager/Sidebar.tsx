import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import { FaHome, FaBox, FaUsers, FaClipboardList, FaChevronDown, FaChevronUp, FaStore } from 'react-icons/fa';
import { BiSolidOffer } from "react-icons/bi";
import { TbReportAnalytics } from 'react-icons/tb';
import { isAdmin } from '../../services/auth.service';

interface SidebarProps {
    isOpen: boolean;
}

const Sidebar: React.FC<SidebarProps> = ({ isOpen }) => {
    const [isDropdownAccountOpen, setDropdownAccountOpen] = useState(false);
    const toggleDropdownAccount = () => setDropdownAccountOpen(!isDropdownAccountOpen);

    const [isDropdownProductOpen, setDropdownProductOpen] = useState(false);
    const toggleDropdownProduct = () => setDropdownProductOpen(!isDropdownProductOpen);

    const [isDropdownDiscountOpen, setDropdownDiscountOpen] = useState(false);
    const toggleDropdownDiscount = () => setDropdownDiscountOpen(!isDropdownDiscountOpen);

    return (
        <aside className={`bg-black text-white w-64 fixed h-screen overflow-y-auto transform transition-transform duration-300 ${isOpen ? 'translate-x-0' : '-translate-x-full'}`}>
            <div className="p-4">
                <h2 className="text-lg font-bold mb-4">Menu</h2>
                <img
                    src="https://media.istockphoto.com/id/1406611044/vi/vec-to/thi%E1%BA%BFt-k%E1%BA%BF-logo-chai-n%C6%B0%E1%BB%9Bc-hoa-sang-tr%E1%BB%8Dng-minh-h%E1%BB%8Da-cho-m%E1%BB%B9-ph%E1%BA%A9m-l%C3%A0m-%C4%91%E1%BA%B9p-th%E1%BA%A9m-m%E1%BB%B9-vi%E1%BB%87n-s%E1%BA%A3n-ph%E1%BA%A9m.jpg?s=612x612&w=0&k=20&c=R6pze5UeNvGGQtJpRViiS9YlLduaF7HahXuVDuxhgnk="
                    alt=""
                    className="w-64 h-64 object-cover mx-auto rounded shadow-lg"
                />
                <ul className="space-y-2">
                    <li>
                        <Link to="/" className="flex items-center px-4 py-2 hover:bg-gray-700 rounded transition duration-200">
                            <FaHome className="mr-2" /> Trang chủ
                        </Link>
                    </li>
                    <li>
                        <Link to="/manager/revenue" className="flex items-center px-4 py-2 hover:bg-gray-700 rounded transition duration-200">
                            <TbReportAnalytics className="mr-2" /> Doanh thu
                        </Link>
                    </li>
                    <li>
                        <Link to="/manager/sales-counter" className="flex items-center px-4 py-2 hover:bg-gray-700 rounded transition duration-200">
                            <FaStore className="mr-2" /> Bán hàng tại quầy
                        </Link>
                    </li>
                    <li>
                        <div onClick={toggleDropdownProduct} className="flex items-center px-4 py-2 hover:bg-gray-700 rounded cursor-pointer transition duration-200">
                            <FaBox className="mr-2" /> Quản lý sản phẩm
                            {isDropdownProductOpen ? <FaChevronUp className="ml-auto" /> : <FaChevronDown className="ml-auto" />}
                        </div>
                        {isDropdownProductOpen && (
                            <ul className="ml-10 mt-2 space-y-1">
                                <li>
                                    <Link to="/manager/product-management" className="block px-4 py-1 hover:bg-gray-700 rounded text-left transition duration-200">
                                        Sản phẩm
                                    </Link>
                                </li>
                                <li>
                                    <Link to="/manager/brand-management" className="block px-4 py-1 hover:bg-gray-700 rounded text-left transition duration-200">
                                        Thương hiệu
                                    </Link>
                                </li>
                                <li>
                                    <Link to="/manager/category-management" className="block px-4 py-1 hover:bg-gray-700 rounded text-left transition duration-200">
                                        Thể loại
                                    </Link>
                                </li>
                            </ul>
                        )}
                    </li>
                    <li>
                        {isAdmin() && (
                            <div onClick={toggleDropdownAccount} className="flex items-center px-4 py-2 hover:bg-gray-700 rounded cursor-pointer transition duration-200">
                                <FaUsers className="mr-2" /> Quản lý tài khoản
                                {isDropdownAccountOpen ? <FaChevronUp className="ml-auto" /> : <FaChevronDown className="ml-auto" />}
                            </div>
                        )}
                        {isDropdownAccountOpen && (
                            <ul className="ml-10 mt-2 space-y-1">
                                <li>
                                    <Link to="/manager/staff-management" className="block px-4 py-1 hover:bg-gray-700 rounded text-left transition duration-200">
                                        Nhân viên
                                    </Link>
                                </li>
                                <li>
                                    <Link to="/manager/user-management" className="block px-4 py-1 hover:bg-gray-700 rounded text-left transition duration-200">
                                        Khách hàng
                                    </Link>
                                </li>
                            </ul>
                        )}
                    </li>
                    <li>
                        {isAdmin() && (
                            <div onClick={toggleDropdownDiscount} className="flex items-center px-4 py-2 hover:bg-gray-700 rounded cursor-pointer transition duration-200">
                                <BiSolidOffer className="mr-2" /> Quản lý giảm giá
                                {isDropdownDiscountOpen ? <FaChevronUp className="ml-auto" /> : <FaChevronDown className="ml-auto" />}
                            </div>
                        )}
                        {isDropdownDiscountOpen && (
                            <ul className="ml-10 mt-2 space-y-1">
                                <li>
                                    <Link to="/manager/discount-management" className="block px-4 py-1 hover:bg-gray-700 rounded text-left transition duration-200">
                                        Đợt giảm giá
                                    </Link>
                                </li>
                                <li>
                                    <Link to="/manager/voucher-management" className="block px-4 py-1 hover:bg-gray-700 rounded text-left transition duration-200">
                                        Mã giảm giá
                                    </Link>
                                </li>
                            </ul>
                        )}
                    </li>
                    <li>
                        <Link to="/manager/order-management" className="flex items-center px-4 py-2 hover:bg-gray-700 rounded transition duration-200">
                            <FaClipboardList className="mr-2" /> Quản lý đơn hàng
                        </Link>
                    </li>
                </ul>
            </div>
        </aside>
    );
};

export default Sidebar;
